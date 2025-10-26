package negrar.piberlo.antibiotichelper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
//import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import negrar.piberlo.antibiotichelper.model.AntibioticiRepository
import negrar.piberlo.antibiotichelper.model.Antibiotico
import negrar.piberlo.antibiotichelper.ui.theme.AntibioticHelperTheme
import androidx.compose.foundation.background
//import androidx.compose.foundation.border
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.verticalScroll
import androidx.activity.compose.BackHandler
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.foundation.text.ClickableText
import androidx.compose.ui.text.AnnotatedString
//import androidx.compose.ui.text.TextStyle
import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import androidx.compose.ui.platform.LocalContext
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Brightness4
import androidx.compose.material.icons.filled.Brightness7


private val DISCLAIMER_KEY = booleanPreferencesKey("disclaimer_shown")
private val THEME_KEY = booleanPreferencesKey("theme_dark")

class MainActivity : ComponentActivity() {
    private val Context.dataStore by preferencesDataStore(name = "settings")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val context = LocalContext.current
            val scope = rememberCoroutineScope()
            var showDialog by remember { mutableStateOf(false) }
            var dontShowAgain by remember { mutableStateOf(false) }
            var checkedPref by remember { mutableStateOf(false) }
            var isDarkTheme by remember { mutableStateOf(false) }

            LaunchedEffect(Unit) {
                val prefs = context.dataStore.data.first()
                checkedPref = prefs[DISCLAIMER_KEY] ?: false
                isDarkTheme = prefs[THEME_KEY] ?: false
                showDialog = !checkedPref
            }

            AntibioticHelperTheme(darkTheme = isDarkTheme) {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(modifier = Modifier.padding(innerPadding)) {
                        DisclaimerWrapper(
                            dataStore = context.dataStore
                        ) {
                            AntibioticiScreen(
                                isDarkTheme = isDarkTheme,
                                onThemeToggle = {
                                    isDarkTheme = !isDarkTheme
                                    scope.launch {
                                        context.dataStore.edit { it[THEME_KEY] = isDarkTheme }
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun DisclaimerWrapper(
    dataStore: DataStore<Preferences>,
    content: @Composable () -> Unit
) {
    val scope = rememberCoroutineScope()
    var showDialog by remember { mutableStateOf(false) }
    var dontShowAgain by remember { mutableStateOf(false) }
    var checkedPref by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        val prefs = dataStore.data.first()
        checkedPref = prefs[DISCLAIMER_KEY] ?: false
        showDialog = !checkedPref
    }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = {},
            title = { Text("Attenzione") },
            text = {
                Column {
                    Text("Ho provato a fornire le informazioni più corrette possibili, ma non sono infallibile! Controlla sempre sulla scheda tecnica del farmaco.\nSe trovi errori o hai richieste scrivimi a z1017346@gmail.com")
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(checked = dontShowAgain, onCheckedChange = { dontShowAgain = it })
                        Text("Non mostrare più questo messaggio")
                    }
                }
            },
            confirmButton = {
                Button(onClick = {
                    if (dontShowAgain) {
                        scope.launch {
                            dataStore.edit { it[DISCLAIMER_KEY] = true }
                        }
                    }
                    showDialog = false
                }) {
                    Text("OK, ho capito")
                }
            }
        )
    } else {
        content()
    }
}

@Composable
fun AntibioticiScreen(isDarkTheme: Boolean, onThemeToggle: () -> Unit) {
    var query by remember { mutableStateOf("") }
    var selected by remember { mutableStateOf<Antibiotico?>(null) }
    val antibiotici = AntibioticiRepository.antibiotici
        .sortedBy { it.nome }
        .filter { it.nome.contains(query, ignoreCase = true) }

    if (selected == null) {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = query,
                    onValueChange = { query = it },
                    label = { Text("Cerca antibiotico") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                IconButton(onClick = onThemeToggle) {
                    Icon(
                        imageVector = if (isDarkTheme) Icons.Filled.Brightness7 else Icons.Filled.Brightness4,
                        contentDescription = "Toggle Theme"
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            LazyColumn(modifier = Modifier.fillMaxWidth().weight(1f)) {
                items(antibiotici) { ab ->
                    Text(
                        text = ab.nome,
                        modifier = Modifier
                            .clickable { selected = ab }
                            .padding(vertical = 12.dp, horizontal = 8.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Dr Pietro Berloni - v 1.0",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                style = MaterialTheme.typography.bodySmall,
                fontStyle = FontStyle.Italic
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "z1017346@gmail.com",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                style = MaterialTheme.typography.bodySmall,
                //fontStyle = FontStyle.Italic
            )
        }
    } else {
        // Gestione tasto indietro di sistema
        BackHandler { selected = null }
        AntibioticoDetailScreen(
            antibiotico = selected!!,
            isDarkTheme = isDarkTheme,
            onBack = { selected = null }
        )
    }
}

@Composable
fun AntibioticoDetailScreen(
    antibiotico: Antibiotico,
    isDarkTheme: Boolean,
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Button(
            onClick = onBack,
            modifier = Modifier.padding(bottom = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isDarkTheme) MaterialTheme.colorScheme.primary else Color(0xFF1B58A1)
            )
        ) {
            Text("Indietro")
        }
        Text(text = antibiotico.nome, style = MaterialTheme.typography.headlineMedium) //rimosso androidx.compose.material3.
        Spacer(modifier = Modifier.height(16.dp))
        if (!antibiotico.dosaggioRegolare.isNullOrBlank()) {
            Section(title = "Dosaggio regolare", content = antibiotico.dosaggioRegolare, isDarkTheme = isDarkTheme)
        }
        if (!antibiotico.dosaggioOrale.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(12.dp))
            Section(title = "Dosaggio orale", content = antibiotico.dosaggioOrale, isDarkTheme = isDarkTheme)
        }
        if (!antibiotico.formulazioneOrale.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(4.dp))
            Section(title = "Formulazione orale", content = antibiotico.formulazioneOrale, isDarkTheme = isDarkTheme)
        }
        if (!antibiotico.dosaggiParticolari.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(12.dp))
            Section(title = "Dosaggi particolari", content = antibiotico.dosaggiParticolari, isDarkTheme = isDarkTheme)
        }

        if (!antibiotico.soluzioniDiluizione.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(12.dp))
            Section(title = "Soluzioni di diluizione", content = antibiotico.soluzioniDiluizione, isDarkTheme = isDarkTheme)
            Spacer(modifier = Modifier.height(6.dp))
        }
        if (!antibiotico.volumeInfusione.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(4.dp))
            Section(title = "Volume di infusione", content = antibiotico.volumeInfusione, isDarkTheme = isDarkTheme)
        }

        if (!antibiotico.tempoInfusione.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(6.dp))
            Section(title = "Tempo di infusione", content = antibiotico.tempoInfusione, isDarkTheme = isDarkTheme)
        }

        if (!antibiotico.adattamentiRenali.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(12.dp))
            Section(title = "Adattamenti renali", content = antibiotico.adattamentiRenali, isDarkTheme = isDarkTheme)
            Spacer(modifier = Modifier.height(12.dp))
        }
        if (!antibiotico.adattamentiEpatici.isNullOrBlank()) {
            Section(title = "Adattamenti epatici", content = antibiotico.adattamentiEpatici, isDarkTheme = isDarkTheme)
        }
        if (!antibiotico.note.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(12.dp))
            Section(title = "Note", content = antibiotico.note, isDarkTheme = isDarkTheme)
        }
        if (!antibiotico.linkUtili.isNullOrEmpty()) {
            Spacer(modifier = Modifier.height(12.dp))
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Link utili", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(4.dp))
                val uriHandler = LocalUriHandler.current
                antibiotico.linkUtili.forEach { link ->
                    val regex = Regex("\\[(.*?)\\]\\((.*?)\\)")
                    val matches = regex.findAll(link)
                    for (match in matches) {
                        val label = match.groups[1]?.value ?: link
                        val url = match.groups[2]?.value ?: link
                        ClickableText(
                            text = AnnotatedString(label),
                            style = MaterialTheme.typography.bodyLarge.copy(Color(0xFF427ef5)),
                            onClick = { uriHandler.openUri(url) }
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun Section(title: String, content: String, isDarkTheme: Boolean) {
    val headerColor = if (isDarkTheme) Color(0xFF333C44) else Color(0xFFE0E0E0)
    val rowEvenColor = if (isDarkTheme) Color(0xFF23272B) else Color(0xFFEEEEEE)
    val rowOddColor = if (isDarkTheme) Color(0xFF181A1B) else Color(0xFFF8F8F8)
    val textColor = if (isDarkTheme) Color(0xFFF5F5F5) else Color(0xFF000000)
    val uriHandler = LocalUriHandler.current
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = title, style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(4.dp))
        if (title == "Note" && content.contains("[Scheda tecnica AIFA](")) {
            val regex = Regex("\\[Scheda tecnica AIFA\\]\\((.*?)\\)")
            val match = regex.find(content)
            val url = match?.groups?.get(1)?.value
            if (url != null) {
                ClickableText(
                    text = AnnotatedString("Scheda tecnica AIFA"),
                    style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.primary),
                    onClick = { uriHandler.openUri(url) }
                )
            }
        } else if (title.contains("renali", ignoreCase = true) && content.contains("\u2022")) {
            val rows = content.split("\n").mapNotNull {
                val parts = it.removePrefix("\u2022 ").split(":", limit = 2)
                if (parts.size == 2) parts[0].trim() to parts[1].trim() else null
            }
            if (rows.isNotEmpty()) {
                // Header
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(headerColor)
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "Funzione renale",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(1f),
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        color = textColor
                    )
                    Text(
                        "Posologia",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(2f),
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        color = textColor
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))
                // Rows
                rows.forEachIndexed { idx, (funzione, posologia) ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(if (idx % 2 == 0) rowEvenColor else rowOddColor)
                            .padding(vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            funzione,
                            modifier = Modifier.weight(1f).padding(start = 8.dp),
                            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                            color = textColor
                        )
                        Text(
                            posologia,
                            modifier = Modifier.weight(2f).padding(start = 8.dp),
                            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                            color = textColor
                        )
                    }
                }
            } else {
                Text(text = content, style = MaterialTheme.typography.bodyLarge)
            }
        } else {
            Text(text = content, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

@Composable
fun AntibioticoDetailDialog(antibiotico: Antibiotico, onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(antibiotico.nome) },
        text = {
            Column {
                Text("Dosaggio regolare: ${antibiotico.dosaggioRegolare}")
                Spacer(modifier = Modifier.height(4.dp))
                Text("Soluzioni di diluizione: ${antibiotico.soluzioniDiluizione}")
                Spacer(modifier = Modifier.height(4.dp))
                Text("Adattamenti renali: ${antibiotico.adattamentiRenali ?: "Nessuno"}")
                Spacer(modifier = Modifier.height(4.dp))
                Text("Adattamenti epatici: ${antibiotico.adattamentiEpatici ?: "Nessuno"}")
            }
        },
        confirmButton = {
            Button(onClick = onDismiss) {
                Text("Chiudi")
            }
        }
    )
}