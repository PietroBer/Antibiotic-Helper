package negrar.piberlo.antibiotichelper.model

/**
 * Rappresenta un antibiotico con le informazioni cliniche rilevanti.
 */
data class Antibiotico(
    val nome: String,
    val dosaggioRegolare: String? = null,
    val soluzioniDiluizione: String? = null,
    val adattamentiRenali: String? = null,
    val adattamentiEpatici: String? = null,
    val tempoInfusione: String? = null,
    val dosaggiParticolari: String? = null,
    val note: String? = null,
    val dosaggioOrale: String? = null,
    val formulazioneOrale: String? = null,
    val linkUtili: List<String>? = null,
    val volumeInfusione: String? = null
) 