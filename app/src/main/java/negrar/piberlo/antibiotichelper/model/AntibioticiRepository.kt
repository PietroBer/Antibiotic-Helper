package negrar.piberlo.antibiotichelper.model

object AntibioticiRepository {
    val antibiotici = listOf(
        Antibiotico(
            nome = "Amikacina",
            dosaggioRegolare = "15 mg/kg/die (7.5 mg/kg q12h), max 1.5g/die",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "100-200 ml (minimo 100 ml)",
            adattamentiRenali = "• ClCr > 50 ml/min: dose standard\n• ClCr 10-50 ml/min: 7.5 mg/kg q24h\n• ClCr < 10 ml/min: 7.5 mg/kg q48h\n• Emodialisi: 7.5 mg/kg q48h + 3.75 mg/kg dopo dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "30-60 minuti",
            dosaggiParticolari = "In infezioni gravi o da Pseudomonas, preferire la dose più alta. Monitorare livelli plasmatici.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Amikacina)"),
            note = "- Possibile dosaggio plasmatico per adeguare la posologia.\n" +
                    "- Come gli altri aminoglicosidi rischio di:\n" +
                    "   • Nefrotossicità (necrosi tubulare acuta)\n" +
                    "   • Otossicità\n" +
                    "   • Prolungare l'effetto dei blocanti neuromuscolari (raro)\n" +
                    "- Evitare somministrazione in doppia via con beta-lattamici (viene inattivata)\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Amoxicillina/Clavulanato",
            dosaggioRegolare = "1g/200mg q8h EV. Nelle infezioni più gravi o nel sospetto di anaerobi 2g/200mg q8h",
            dosaggioOrale = "875/125mg ogni 8-12 ore",
            formulazioneOrale = "Compresse, sospensione",
            dosaggiParticolari = "In infezioni gravi (es. sospetto di anaerobi, polmoniti severe, infezioni intra-addominali) può essere usata la dose di 2g/200mg ogni 8 ore EV.",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, Ringer",
            volumeInfusione = "min 20ml (bolo lento), normalmente 100ml",
            tempoInfusione = "Possiible bolo lento (5 min), meglio in 30-60 minuti",
            adattamentiRenali = "• ClCr > 30 ml/min: dose standard (1g/200mg ogni 8 ore)\n• ClCr 10-30 ml/min: carico 1g/200mg, poi 500mg/100mg q12h\n• ClCr < 10 ml/min: carico 1g/200mg, poi 500mg/100mg ogni 24 ore\n• Emodialisi: carico 1g/200mg, poi 500mg/100mg q24h + 500mg/100mg dopo seduta dialitica",
            adattamentiEpatici = "Usare con cautela in caso di insufficienza epatica grave; monitorare la funzionalità epatica durante il trattamento",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Amoxicillina+Clavulanato)"),
            note = "Verificata ✅"
        ),
        Antibiotico(
            nome = "Ampicillina",
            dosaggioRegolare = "1-2g ogni 4-6 ore EV",
            dosaggiParticolari = "Meningite: 2g q4h EV. Endocardite enterococcica: 2g q4h EV.",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "50-100 ml (minimo 50 ml)",
            tempoInfusione = "15-30 minuti",
            adattamentiRenali = "• ClCr > 50 ml/min: dose standard (2g ogni 4 ore)\n• ClCr 30-50 ml/min: 2g ogni 6 ore\n• ClCr 15-30 ml/min: 2g ogni 8 ore\n• ClCr <15 ml/min: 2g ogni 12 ore\n• Emodialisi: 2g ogni 12 ore (somm. la dose dopo la seduta)",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Ampicillina)"),
            note = "- Non è specificata in scheda tecnica la riduzione del dosaggio in caso di insufficienza renale, in tabella è riportata un expert di UpToDate!\n" +
                   "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Anidulafungina",
            dosaggioRegolare = "Carico 200mg EV, poi 100mg ogni 24 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "Minimo: 200mg in 200 ml, 100 mg in 100 ml",
            tempoInfusione = "180 min per 200mg, 90 minuti per 100 mg (max 1.1 mg/min)",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Anidulafungina)"),
            note = "- Verificata ✅"

        ),
        Antibiotico(
            nome = "Azitromicina",
            dosaggioRegolare = "500mg ogni 24 ore EV",
            dosaggioOrale = "500mg ogni 24 ore",
            formulazioneOrale = "Compresse, sospensione",
            dosaggiParticolari = "Polmonite atipica, infezioni da clamidia.",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "250 ml",
            tempoInfusione = "min. 60 minuti",
            adattamentiRenali = "• ClCr > 10 ml/min: Dose standard\n • ClCr < 10 ml/min: Usare con cautela (RCP). Non necessari aggiustamenti (Sanford)\n• Dialisi: Non necessari aggiustamenti (Sanford)",
            adattamentiEpatici = "Usare con cautela in insufficienza epatica grave (RCP).\nNon necessari aggiustamenti (Sanford)",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Azitromicina)"),
            note = "- Monitoraggio QTc\n" +
                    "- Verificata ✅"

        ),
        Antibiotico(
            nome = "Caspofungina",
            dosaggioRegolare = "Carico 70mg EV, poi 50mg ogni 24 ore EV",
            dosaggiParticolari = "Se peso > 80 Kg proseguire a 70 mg/die (RCP)",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, Ringer",
            volumeInfusione = "100 ml",
            tempoInfusione = "60 minuti",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "• Insufficienza epatica moderata (Child-Pugh 7-9): carico 70 mg poi ridurre a 35mg/die.\n• Grave: non disponibili dati (RCP)",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Caspofungina), [Calcola Child-Pugh](https://www.mdcalc.com/calc/340/child-pugh-score-cirrhosis-mortality)"),
            note = "- NO glucosata (diventa instabile)\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Cefazolina",
            dosaggioRegolare = "1-2g ogni 8 ore EV. Max 12 g/die",
            dosaggiParticolari = "Profilassi chirurgica: 2g EV 30-60 minuti prima dell'incisione. Se intervento prolungato ripetere infusione a 4 ore.",
            soluzioniDiluizione = "Soluzione fisiologica 0.9% o 0.45%, glucosata 5% o 10%, Ringer o Ringer lattato)",
            volumeInfusione = "50-100 ml",
            tempoInfusione = "30-60 minuti",
            adattamentiRenali = "• ClCr ≥  55 ml/min: Dose standard\n• ClCr 35-54 ml/min: Dose standard ogni 8 h\n• ClCr 11-34 ml/min: 1/2 della dose standard ogni 12 ore\n• ClCr ≤ 10 ml/min: 1/4 della dose standard ogni 18-24 ore\n• Emodialisi: 1/4 dose standard ogni 24 ore (somm. la dose dopo la seduta).",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Cefazolina)"),
            note = "Verificata ✅"
        ),
        Antibiotico(
            nome = "Cefepime",
            dosaggioRegolare = "1g ogni 12 ore EV",
            dosaggiParticolari = "Infezioni gravi: 2g ogni 12 ore. Meningite: 2g ogni 8 ore EV.",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5% o 10%, Ringer",
            volumeInfusione = "100 ml",
            tempoInfusione = "30 minuti",
            adattamentiRenali = "• ClCr ≥  50 ml/min: dose standard\n• ClCr 30-50 ml/min: max 2g ogni 12 h\n• ClCr 11-29 ml/min: max 2g ogni 24 ore\n• ClCr ≤ 10 ml/min: max 1 g ogni 24 ore\n• Emodialisi: Carico 1g. Poi 500 mg/die (1g/die nella neutropenia febbrile), somm. dopo la seduta",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Cefepime)"),
            note = "- Sull'RCP vi è una tabella più esaustiva per i vari dosaggi terapeutici, qui è riportato il massimo consentito.\n" +
                    "- Richio di stato epilettico non convulsivo ⚠\uFE0F\n" +
                    "- Verificata ✅"

        ),
        Antibiotico(
            nome = "Cefiderocol",
            dosaggioRegolare = "2g ogni 8 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "100 ml (minimo 100 ml)",
            tempoInfusione = "180 minuti",
            adattamentiRenali = "• ClCr ≥ 120 ml/min: 2g ogni 6 ore.\n• ClCr 60-119 ml/min: Dose standard (2g ogni 8 ore)\n• ClCr 30-59 ml/min: 1.5g ogni 8 ore\n• ClCr 15-29 ml/min: 1g ogni 8 ore\n• ClCr < 15 ml/min: 0.75g ogni 12 ore\n• Emodialisi: 0.75g ogni 12 ore, somm. la dose dopo la seduta",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Cefiderocol)"),
            note = "Verificata ✅"

        ),
        Antibiotico(
            nome = "Ceftarolina",
            dosaggioRegolare = "600mg ogni 12 ore EV",
            dosaggiParticolari = "Polmoniti gravi, infezioni complicate della cute e dei tessuti molli 600 mg ogni 8 ore",
            soluzioniDiluizione = "Soluzione fisiologica 0.9% o 0.45%, glucosata 5%, Ringer lattato",
            volumeInfusione = "100-250 ml (minimo 50 ml)",
            tempoInfusione = "60-120 minuti",
            adattamentiRenali = "• ClCr > 50 ml/min: dose standard\n• ClCr 31-50 ml/min: 400mg ogni 12 ore (8 ore per il dosaggio elevato)\n• ClCr 15-30 ml/min: 300mg ogni 12 ore (8 ore per il dosaggio elevato)\n• ClCr < 15 ml/min: 200mg ogni 12 ore (8 ore per il dosaggio elevato)\n• Emodialisi: 200mg ogni 12 ore (8 ore per il dosaggio elevato), somm. la dose dopo la dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Ceftarolina)"),
            note = "Verificata ✅"
        ),
        Antibiotico(
            nome = "Ceftazidima",
            dosaggioRegolare = "1-2g ogni 8 ore EV",
            dosaggiParticolari = "Meningite: 2g ogni 8 ore EV. Infezioni gravi da Pseudomonas.",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%, sodio lattato",
            volumeInfusione = "100 ml (minimo 50 ml)",
            tempoInfusione = "30-60 minuti",
            adattamentiRenali = "• ClCr > 50 ml/min: dose standard (1-2g ogni 8 ore)\n• ClCr 31-50 ml/min: 1g ogni 12 ore\n• ClCr 16-30 ml/min: 1g ogni 24 ore\n• ClCr 6-15 ml/min: 0.5 g ogni 24 ore\n• ClCr <5 ml/min: 0.5 g ogni 48 h\n• Emodialisi: 0.5-1 g dopo la seduta dialitica (vedi tabella RCP)",
            adattamentiEpatici = "• Insufficienza epatica lieve o moderata: non sono necessari aggiustamenti.\n• Insufficienza epatica severa: non disponibili dati (RCP). Non necessari aggiustamenti (Sanford)",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Ceftazidima)"),
            note = "- Negli anziani (>80 aa) evitare di superare i 3g/die (RCP)\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Ceftazidima/Avibactam",
            dosaggioRegolare = "2g/0.5g ogni 8 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%, Ringer lattato",
            volumeInfusione = "minimo 100 ml",
            tempoInfusione = "120 minuti",
            adattamentiRenali = "• ClCr > 50 ml/min: dose standard (2g/0.5g ogni 8 ore)\n• ClCr 31-50 ml/min: 1g/0.25g ogni 8 ore\n• ClCr 16-30 ml/min: 0.75g/0.188g ogni 12 ore\n• ClCr 6-15 ml/min: 0.75g/0.188g ogni 24 ore\n• ClCr ≤ 5 ml/min: 0.75g/0.188g ogni 48 ore\n• Emodialisi: 0.75g/0.188g ogni 48 ore. Somm. la dose dopo dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Ceftazidima+Avibactam)"),
            note = "Verificata ✅"
        ),
        Antibiotico(
            nome = "Ceftriaxone",
            dosaggioRegolare = "2g ogni 24 ore EV (fino a 4g/die in infezioni gravi)",
            dosaggiParticolari = "• Meningite: 2g ogni 12 ore EV.\n• Gonorrea: dose singola 1g EV/IM.",
            soluzioniDiluizione = "Soluzione fisiologica 0.9% o glucosata 5%",
            volumeInfusione = "100 ml (minimo 100 ml)",
            tempoInfusione = "30 minuti",
            adattamentiRenali = "• ClCr ≥ 10 ml/min: dose standard (2-4g ogni 24 ore)\n• ClCr <10 ml/min: non superare 2g ogni 24 ore",
            adattamentiEpatici = "• Insufficienza epatica lieve o moderata: non sono necessari aggiustamenti.\n• Insufficienza epatica severa: non disponibili dati (RCP). Non necessari aggiustamenti (Sanford)",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Ceftriaxone)"),
            note = "- NO in soluzioni con Calcio (precipita)\n" +
                    "- Non sono necessari aggiustamenti renali o epatici per il Sanford\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Ciprofloxacina",
            dosaggioRegolare = "400mg ogni 8-12 ore EV",
            dosaggioOrale = "500-750mg ogni 12 ore",
            formulazioneOrale = "Compresse divisibili, granulato per sospensione orale",
            dosaggiParticolari = "Infezioni urinarie complicate, infezioni da Pseudomonas.",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%) o glucosata 5%",
            volumeInfusione = "soluzioni precostituite da 100 ml (200mg) o 200 ml (400mg).\n" +
                              "Se necessario può essere diluita in: soluzione fisiologica 0.9%, glucosata 5% o 10%, Ringer lattato",
            tempoInfusione = "60 minuti",
            adattamentiRenali = "• ClCr > 60 ml/min: Dosaggio standard (400mg ogni 8-12 ore)\n• ClCr 30-60 ml/min: 200-400mg ogni 12 ore\n• ClCr < 30 ml/min: 200-400mg ogni 24 ore\n• Emodialisi: 200-400mg ogni 24 ore. Somm. dopo la dialisi\n",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Ciprofloxacina)"),
            note = "- Per l'adeguamento della posologia renale in caso di formulazione orale valgono gli stessi valori di ClCr e intervallo tra le dosi. Le dosi sono:\n" +
                    "   • 200mg ev -> 250mg po\n" +
                    "   • 400mg ev -> 500mg po\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Claritromicina",
            dosaggioRegolare = "500mg ogni 12 ore EV",
            dosaggioOrale = "500-750mg ogni 24 ore",
            formulazioneOrale = "Compresse, granulato per sospensione orale",
            dosaggiParticolari = "Polmonite nosocomiale: 750mg ogni 24 ore EV.",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "250 ml (minimo 2 mg/ml)",
            tempoInfusione = "60 minuti",
            adattamentiRenali = "• ClCr > 30 ml/min: dose standard (500mg ogni 12 ore)\n• ClCr < 30 ml/min: 1/2 dose standard (500mg ogni 24 ore)\n• Emodialisi: 500mg ogni 24 ore, somm. la dose dopo la dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Claritromicina)"),
            note = "- Monitoraggio QTc\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Clindamicina",
            dosaggioRegolare = "600-1200mg ogni 6-8 ore EV (fino a 4800mg/die)",
            dosaggioOrale = "600-1200mg/die suddivisi in 3 o 4 somm. (fino a 4800mg/die nella Toxoplasmosi cerebrale)",
            formulazioneOrale = "Capsule rigide da 150 mg",
            dosaggiParticolari = "Infezioni da anaerobi, infezioni cutanee e ossee.",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "100 ml (min 18 mg/ml)",
            tempoInfusione = "30-60 minuti (max 30 mg/min)",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Clindamicina)"),
            note = "- Non superare 1200mg per dose\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Colistina",
            dosaggioRegolare = "• Carico: CBA (mg) = 4 x peso (Kg), infusi in 30-60 min\n• Mantenimento: 180 mg ogni 12 ore (iniziare 12 ore dopo il carico)",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%",
            volumeInfusione = "50-100 ml (minimo 50 ml)",
            tempoInfusione = "30-60 minuti",
            adattamentiRenali = "• ClCr ≥ 90 ml/min: dose standard\n• ClCr 80-89 ml/min: 170mg ogni 12 ore\n" +
                                "• ClCr 70-79 ml/min: 150mg ogni 12 ore\n• ClCr 60-69 ml/min: 137.5mg ogni 12 ore\n" +
                                "• ClCr 50-59 ml/min: 122.5mg ogni 12 ore\n• ClCr 40-49 ml/min: 110mg ogni 12 ore\n" +
                                "• ClCr 30-39 ml/min: 97.5mg ogni 12 ore\n • ClCr 20-29 ml/min: 87.5mg ogni 12 ore\n" +
                                "• ClCr 10-19 ml/min: 80mg ogni 12 ore\n• ClCr 5-9 ml/min: 72.5mg ogni 12 ore\n" +
                                "• ClCr < 5 ml/min: 65mg ogni 12 ore\nEmodialisi: Giorno di non-dialisi 65mg ogni 12 ore. Giorno di dialisi dare 40-50mg in aggiunta alla dose successiva",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Colistina)"),
            note = "- Somministrato come profarmaco Colistimetato (CMS), il dosaggio è in CBA (Colistin Base Activity), in mg.\n" +
                    "1mg CBA = 30.000 U CMS = 2.4mg CMS\n" +
                    "- Gli adattamenti renali fanno riferimento alle dosi di mantenimento\n" +
                    "- Fonte principale Sanford\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Daptomicina",
            dosaggioRegolare = "Infezioni cutanee: 4 mg/kg ogni 24 ore EV",
            dosaggiParticolari = "6 mg/Kg se batteriemie o endocarditi\n8-12 mg/Kg nelle batteriemie o endocarditi da MRSA",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%",
            volumeInfusione = "Minimo 100 ml",
            tempoInfusione = "30-60 minuti",
            adattamentiRenali = "• ClCr ≥ 30 ml/min: dose standard\n• ClCr < 30 ml/min: ogni 48 ore\n Dialisi: Ogni 48 ore (dopo la seduta). Se la successiva seduta è a 72h dare 9-15 mg/Kg (Sanford)",
            adattamentiEpatici = "• Sanford: non sono necessari aggiustamenti\n" +
                                 "• RCP: non sono necessari aggiustamenti per Child A o B. Non disponibili dati su insufficienza epatica severa",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Daptomicina)"),
            note =  "- Non usare nelle polmoniti (inattivata dal surfattante)\n" +
                    "- NO in soluzioni con glucosio\n" +
                    "- Dosare CPK durante il trattamento\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Doxiciclina",
            dosaggioRegolare = "200mg il primo giorno poi 100mg ogni 24 ore per os",
            formulazioneOrale = "Compresse",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Doxiciclina)"),
            note =  "- Bambini < 8-12 anni:\n" +
                    "   • RCP: Evitare (ipoplasia dello smalto con denti gialli)\n" +
                    "   • Sanford: Sicura nei bambini (ultimi studi non evidenziano rischi)\n" +
                    "- Fotosensibilità\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Ertapenem",
            dosaggioRegolare = "1g ogni 24 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%",
            volumeInfusione = "100 ml",
            tempoInfusione = "30 minuti",
            adattamentiRenali = "• ClCr > 30 ml/min: dose standard (1g ogni 24 ore)\n• ClCr ≤ 30 ml/min: 500mg ogni 24 ore\n• Emodialisi: 500mg ogni 24 ore, somm. dopo dialisi",
            adattamentiEpatici = "• Insufficienza epatica lieve o moderata: non sono necessari aggiustamenti.\n" +
                                 "• Insufficienza epatica severa: non disponibili dati (RCP). Non necessari aggiustamenti (Sanford)",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Ertapenem)"),
            note =  "- Il dosaggio renale è basato sul Sanford. L'RCP sconsiglia l'uso <30 ml/min per mancanza di dati.\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Fluconazolo",
            dosaggioRegolare = "400mg dose di carico, poi 200-400mg ogni 24 ore EV",
            dosaggiParticolari = "Candidemie: carico 800mg poi 400mg ogni 24 ore.",
            dosaggioOrale = "200-400mg ogni 24 ore",
            formulazioneOrale = "Compresse, sospensione",
            soluzioniDiluizione = "Arriva prediluito, se necessario si può diluire ulteriormente con:\n" +
                                  "Soluzione fisiologica 0.9%, glucosata 5%, Ringer, Ringer lattato, bicarbonato",
            volumeInfusione = "minimo 50 ml",
            tempoInfusione = "30-60 minuti",
            adattamentiRenali = "• ClCr ≥ 50 ml/min: Dose standard\n• ClCr < 50 ml/min: Metà della dose ogni 24 ore\n• Emodialisi: Dose standard i giorni della dialisi (somm. dopo dialisi). Metà dose nei giorni senza dialisi",
            adattamentiEpatici = "• Insufficienza epatica lieve o moderata: non sono necessari aggiustamenti.\n" +
                                 "• Insufficienza epatica severa: non disponibili dati (RCP). Non necessari aggiustamenti (Sanford)",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Fluconazolo), [Interazioni Fluconazolo](https://www.pharmamedix.com/principiovoce.php?pa=Fluconazolo&vo=Interazioni)"),
            note =  "- Dosaggio orale = dosaggio EV\n" +
                    "- Numerose interazioni farmacologiche" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Fosfomicina EV",
            dosaggioRegolare = "12-24gr suddivisi ogni 6-8 ore EV",
            soluzioniDiluizione = "Glucosata 5%, soluzione fisiologica sconsigliata (vedi note)",
            volumeInfusione = "200 ml (minimo 40 mg/ml)",
            tempoInfusione = "3 ore (massimo 8 g/h)",
            adattamentiRenali = "• ClCr ≥ 40 ml/min: dose standard\n" +
                                "• ClCr 31-40 ml/min: 70% DS (divisi ogni 8-12 ore)\n" +
                                "• ClCr 21-30 ml/min: 60% DS (divisi ogni 8-12 ore)\n" +
                                "• ClCr 11-20 ml/min: 40% DS (divisi ogni 8-12 ore)\n" +
                                "• ClCr ≤ 10 ml/min: 20% DS (divisi ogni 12-24 ore)\n" +
                                "• Emodialisi: 2g ogni 48 ore dopo dialisi",
            adattamentiEpatici = "- RCP: non sono necessari aggiustamenti\n- Sanford: Non disponibili dati",
            note =  "- Max 8g a somministrazione.\n" +
                    "- Preferire la glucosata per evitare un eccessivo carico di sodio: 10g di Fosfomicina = 1.000cc SF 0.9%!\n" +
                    "- Rischio di ipoK per elevato carico di sodio.\n" +
                    "- In caso di insufficienza renale la prima dose è normale (Carico da 8gr), le successive vanno in funzione alla dose standard (DS).\n" +
                    "- Verificata ✅",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Fosfomicina)")
        ),
        Antibiotico(
            nome = "Fosfomicina per OS",
            dosaggioRegolare = "3gr in monosomministrazione",
            dosaggiParticolari = "Infezioni urinarie complicate, infezioni da batteri multiresistenti.",
            formulazioneOrale = "Granulato",
            adattamentiRenali = "• ClCr ≥ 10 ml/min: dose standard\n• ClCr < 10 ml/min: evitare",
            adattamentiEpatici = "Non disponibili dati",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Fosfomicina)"),
            note =  "- Assumere 2-3 ore dopo il pasto prima di andare a dormire\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Gentamicina",
            dosaggioRegolare = "Carico 2 mg/kg EV, poi 1.7-2 mg/kg ogni 8 ore",
            dosaggiParticolari = "Intervallo esteso: 7 mg/Kg in unica somministrazione ogni 24 ore\n" +
                                 "Sinergia per infezioni Gram+: 1 mg/Kgb ogni 8 ore",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "Minimo 100 ml",
            tempoInfusione = "30-60 minuti",
            adattamentiRenali = "• ClCr > 50 ml/min: 1.7-2 mg/kg ogni 8 ore\n• ClCr 10-50 ml/min: 1.7-2 mg/kg ogni 12-24 ore\n• ClCr < 10 ml/min: 1.7-2 mg/kg ogni 48 ore\n• Emodialisi: 1.7-2 mg/kg ogni 48 ore, più dose aggiuntiva 0.85-1 mg/kg dopo la dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Gentamicina)"),
            note = "- L'intervallo esteso è consigliato nelle infezioni da G-. In caso di insuff. renale:\n" +
                    "    • ClCr > 60 ml/min: ogni 24 ore\n" +
                    "    • ClCr 40-59 ml/min: ogni 36 ore\n" +
                    "    • ClCr 20-39 ml/min: ogni 48 ore\n" +
                    "    • ClCr <20 ml/min: consigliato dosaggio regolare\n" +
                    "- RCP piuttosto caotica per i dosaggi, i dati sono presi dal Sanford\n" +
                    "- Evitare somministrazione in doppia via con beta-lattamici (viene inattivata)\n" +
                    "- Verificata ✅"

        ),
        Antibiotico(
            nome = "Imipenem/Cilastatina",
            dosaggioRegolare = "1g ogni 8 ore o 500mg ogni 6 ore EV",
            dosaggiParticolari = "Meningite: 1g ogni 6 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%",
            volumeInfusione = "Minimo 100 ml",
            tempoInfusione = "30-60 minuti",
            adattamentiRenali = "• ClCr ≥ 90 ml/min: dose standard\n• ClCr 60-90 ml/min: 500mg ogni 6 ore\n• ClCr 30-60 ml/min: 500mg ogni 8 ore\n• ClCr 15-30 ml/min: 500mg ogni 12 ore\n• ClCr < 15 ml/min: controindicato\n• Emodialisi: 500mg ogni 12 ore (dare dopo dialisi)",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Imipenem)"),
            note =  "- L'adattamento renale fa riferimento alla odse 1g ogni 8 ore.\n" +
                    "  Per dose 500 mg ogni 6 ore:\n" +
                    "     • ClCr ≥ 90 ml/min: dose standard\n" +
                    "     • ClCr 60-90 ml/min: 400mg ogni 6 ore\n" +
                    "     • ClCr 30-60 ml/min: 300 mg ogni 6 ore\n" +
                    "     • ClCr 15-30 ml/min: 200 mg ogni 6 ore\n" +
                    "     • ClCr < 15 ml/min: controindicato\n" +
                    "     • Emodialisi: 200 mg ogni 6 ore (dare dopo la dialisi)\n" +
                    "  Per la dose 1g ogni 6 ore:\n" +
                    "    • ClCr ≥ 90 ml/min: dose standard\n" +
                    "    • ClCr 60-90 ml/min: 750 mg 8 ore\n" +
                    "    • ClCr 30-60 ml/min: 500mg ogni 6 ore\n" +
                    "    • ClCr 15-30 ml/min: 500mg ogni 12 ore\n" +
                    "    • ClCr < 15 ml/min: controindicato\n" +
                    "    • Emodialisi: 500 mg ogni 12 ore (dare dopo la dialisi)\n" +
                    "- Rischio di slatentizzazione di crisi epilettiche\n" +
                    "- Verificata ✅"

        ),
        Antibiotico(
            nome = "Isavuconazolo",
            dosaggioRegolare = "Carico 200mg ogni 8 ore per 6 dosi (2gg), poi 200mg ogni 24 ore EV",
            dosaggiParticolari = "Aspergillosi invasiva, mucormicosi.",
            dosaggioOrale = "200 ogni 24 ore",
            formulazioneOrale = "Compresse",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "250 ml",
            tempoInfusione = "Minimo 60 minuti",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "• Insufficienza epatica lieve o moderata: non sono necessari aggiustamenti.\n" +
                                 "• Insufficienza epatica severa: non disponibili dati (RCP). Dimezzare la dose per i dati sulla farmacocinetica (Sanford)",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Isavuconazolo)"),
            note = "- Unico azolo che abbassa il QTc e non lo alza\n" +
                    "- Utilizzare deflussore con filtro!" +
                    "- Formulazione orale ed EV sono bioequivalenti!" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Levofloxacina",
            dosaggioRegolare = "500-750mg ogni 24 ore EV",
            dosaggiParticolari = "Polmonite nosocomiale: 750mg ogni 24 ore EV.",
            dosaggioOrale = "Stessa posologia ev. 500-750mg ogni 24 ore",
            formulazioneOrale = "Compresse rivestite divisibili",
            soluzioniDiluizione = "Soluzione precostituita da 500mg in 100 ml (5mg/ml)\nSoluzione fisiologica 0.9% o glucosata 5%",
            volumeInfusione = "Minimo 100 ml",
            tempoInfusione = "60 minuti",
            adattamentiRenali = "• ClCr > 50 ml/min: Dose standard (500-750mg ogni 24 ore)\n• ClCr 20-49 ml/min: 750mg ogni 48 ore\n• ClCr < 20 ml/min: Carico 750mg, poi 500mg ogni 48 ore\n• Emodialisi: Carico 750mg, poi 500mg ogni 48 ore",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Levofloxacina)"),
            note = "- L'adattamento per funzione renale fa riferimento alla dose standard di 750 mg/die ed è preso dal Sanford" +
                    "- Monitoraggio QTc\n" +
                    "- Rischio di tendinite, rottura di tendine e neuropatie.\n" +
                    "- Può causare disturbi del sonno" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Linezolid",
            dosaggioRegolare = "600mg ogni 12 ore EV",
            formulazioneOrale = "Compresse, non frantumabili",
            dosaggioOrale = "600mg (1 cp) ogni 12 ore",
            soluzioniDiluizione = "Soluzione precostituita 300 ml",
            tempoInfusione = "30-120 minuti",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Linezolid)"),
            note =  "- Monitorare emocromo per rischio mielotossicità\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Meropenem",
            dosaggioRegolare = "1g ogni 8 ore EV",
            dosaggiParticolari = "In caso di meningite o polmonite in fibrosi cistica, la dose raccomandata è 2g ogni 8 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "Minimo 100 ml",
            tempoInfusione = "15-30 minuti (ideale: 3 ore in infusione prolungata)",
            adattamentiRenali = "• ClCr > 50 ml/min: Dose standard\n• ClCr 26-50 ml/min: Dose standard ogni 12 ore\n• ClCr 10-25 ml/min: 1/2 dose ogni 12 ore\n• ClCr < 10 ml/min: 1/2 dose ogni 24 ore\n• Emodialisi: 1/2 dose ogni 24 ore, somm. dopo la dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Meropenem)"),
            note =  "- Prima dose in 30 min poi le successive in 3h\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Meropenem/Vaborbactam",
            dosaggioRegolare = "2g/2g ogni 8 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%",
            volumeInfusione = "250 ml",
            tempoInfusione = "3 ore",
            adattamentiRenali = "• ClCr > 40 ml/min: Dose standard\n• ClCr 20-39 ml/min: 1g/1g ogni 8 ore\n• ClCr 10-19 ml/min: 1g/1g ogni 12 ore\n• ClCr < 10 ml/min: 0.5/0.5g ogni 12 ore\n• Emodialisi: ",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Meropenem+Vaborbactam)"),
            note =  "- RCP suggerisce di diluire in 250ml ma non specifica una concentrazione minima.\n" +
                    "- Il Sanford riporta adattamenti renali differenti di 10 ml (es. 20-39 > 30-49 ml/min). In tabella sono riportate i valori della scheda tecnina (RCP).\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Metronidazolo",
            dosaggioRegolare = "500mg ogni 6 ore o 1g ogni 12 ore EV",
            soluzioniDiluizione = "Soluzione precostituita da 500mg in 100 ml\nSoluzione fisiologica 0.9% o glucosata 5%",
            volumeInfusione = "Minimo 100 ml",
            tempoInfusione = "30-60 minuti",
            adattamentiRenali = "• ClCr ≥10 ml/min: Dose standard\n• ClCr < 10 ml/min: 7.5mg/Kg ogni 12 ore\n• Emodialisi: 7.5mg/Kg ogni 12 ore (somm. dopo la dialisi)",
            adattamentiEpatici = "Ridurre del 50% la dose se Child-Pugh C (Sanford).\nRidurre la dose in caso di grave insufficienza epatica (RCP)",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Metronidazolo)"),
            note =  "- La tabella dell'insufficienza renale fa riferimento al Sanford. Per l'RCP non è necessaria alcuna modifica ma <<monitorare per effetti tossici>>\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Micafungina",
            dosaggioRegolare = "100mg ogni 24 ore EV",
            dosaggiParticolari = "- Candidosi esofagea: 150mg\n- Candidosi invasiva: 100mg (fino a 200mg per RCP)",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "Minimo 100 ml",
            tempoInfusione = "60 minuti",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "• Insufficienza epatica lieve o moderata: non sono necessari aggiustamenti.\n" +
                                 "• Insufficienza epatica severa: non disponibili dati (RCP). Non sono necessari aggiustamenti (Sanford)",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Micafungina)"),
            note =  "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Oxacillina",
            dosaggioRegolare = "2g ogni 4 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5% o 10%, Ringer lattato",
            volumeInfusione = "Minimo 100 ml (max 2 mg/ml per RCP)",
            tempoInfusione = "60 minuti",
            adattamentiRenali = "• ClCr ≥10 ml/min: Dose standard\n• ClCr < 10 ml/min: Considerare riduzione della dose (RCP e Sanford)",
            adattamentiEpatici = "Usare con cautela in insufficienza epatica grave",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Oxacillina)"),
            note =  "- Verificata ✅"

        ),
        Antibiotico(
            nome = "Piperacillina/Tazobactam",
            dosaggioRegolare = "4.5g ogni 8 ore EV in 3-4 ore (prima dose in 30 min)",
            dosaggiParticolari = "Pseudomonas 4.5g ogni 6 ore",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%, Ringer lattato, soluzione di Hartman, Ringer acetato",
            volumeInfusione = "Minimo 100 ml",
            tempoInfusione = "30 minuti (ideale: 3-4 ore in infusione prolungata)",
            adattamentiRenali = "• ClCr ≥ 40 ml/min: Dose standard (4.5g ogni 8 ore)\n• ClCr 20-40 ml/min: Max 4.5g ogni 8 ore\n• ClCr < 20 ml/min: Max 2.25g ogni 12 ore\n• Emodialisi: 2.25g ogni 8 ore durante i giorni senza dialisi; dose 2.25g dopo seduta di dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti significativi",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Piperacillina+Tazobactam)"),
            note =  "- Preferire l'infusione prolungata. L'infusione breve andrebbe riservata nei pazienti con problemi di accessi vascolari.\n" +
                    "- Evitare infusione in doppia via con aminoglicosidi (vengono inattivati).\n" +
                    "- Evitare infusione in doppia via con bicarbonato (precipita).\n" +
                    "- Sul Sanford gli adattamenti per la funzione renale sono differenti:\n" +
                    "  INFUSIONE ESTESA\n" +
                    "    • ≥ 20 ml/min: dose standard\n" +
                    "    • < 20 ml/min: 4.5g ogni 12 ore\n" +
                    "    • Dialisi: 4.5g ogni 12 ore\n" +
                    "  INFUSIONE INTERMITTENTE\n" +
                    "    • > 40 ml/min: dose standard\n" +
                    "    • 20-40 ml/min: max 3.375mg ogni 6 ore\n" +
                    "    • < 20 ml/min: max 2.25g ogni 6 ore\n" +
                    "    • Dialisi: max 2.25g ogni 8 ore (+ 0.75g dopo la dialisi)\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Polimixina B",
            dosaggioRegolare = "Carico 2.5 mg/kg EV, poi dopo 12 ore iniziare la dose di mantenimento: 1.5 mg/Kg EV ogni 12 ore",
            soluzioniDiluizione = "Glucosata 5%",
            volumeInfusione = "Minimo 250 ml",
            tempoInfusione = "Carico 2 ore; dose di mantenimento in 1 ora",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            // linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Polimixina+B)"),
            note =  "- Somministrare acido ascorbico 1 g EV ogni 6 ore per ridurre il rischio di nefrotossicità\n" +
                    "- Associare terapia con carbapenemi per ridurre lo sviluppo di resistenze\n" +
                    "- Non disponibile in Italia la formulazione EV\n" +
                    "- Non indicato per le IVU (non escreto nelle urine)\n" +
                    "- Fonte Sanford (non disponibile RCP)\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Posaconazolo",
            dosaggioRegolare = "Carico 300mg ogni 12 ore per 2 dosi, poi 300mg ogni 24 ore",
            formulazioneOrale = "Compresse a rilascio prolungato, sospensione",
            dosaggioOrale = "Compresse 100 mg, sospensione 40 mg/ml",
            dosaggiParticolari = "Profilassi infezioni fungine:\n" +
                    "   - Compresse: carico 300mg ogni 12 h per 2 dosi, poi 300mg ogni 24 ore\n" +
                    "   - Sospensione: 200mg ogni 8 ore\n" +
                    "Candidosi orofaringea:\n" +
                    "   - Sospensione: 100mg ogni 12 ore per 2 dosi, poi 100mg ogni 24 ore",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "Minimo 150 ml (min 2 mg/ml)",
            tempoInfusione = "90 minuti",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Usare con cautela in insufficienza epatica grave",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Posaconazolo),[Interazioni farmacologiche](https://www.drugs.com/drug-interactions/posaconazole.html)"),
            note =  "- Per la formulazione EV la fonte è il Sanford, non trovo formulazioni EV per l'Italia\n" +
                    "- Monitoraggio QTc\n" +
                    "- Numerose interazioni farmacologiche (vedi link sotto)\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Rifampicina",
            dosaggioRegolare = "600-900mg ogni 24 ore EV o per os (suddivisa in 2-3 somministrazioni)",
            // formulazioneOrale = "Compresse, capsule",
            // dosaggioOrale = "600mg ogni 24 ore",
            dosaggiParticolari = "Endocarditi MSSA o MRSA su protesi, Tubercolosi",
            soluzioniDiluizione = "Soluzione fisiologica 0.9%, glucosata 5%",
            volumeInfusione = "100 ml (minimo 100 ml)",
            tempoInfusione = "30 minuti",
            adattamentiRenali = "• ClCr > 50 ml/min: Dose standard\n• ClCr ≤ 50 ml/min: 300-600mg ogni 24 ore\n• Emodialisi: 300-600mg ogni 24 ore",
            adattamentiEpatici = "Non necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Rifampicina),[Interazioni farmacologiche](https://www.drugs.com/cons/rifampin-intravenous.html)"),
            note =  "- Numerose interazioni farmacologiche (vedi link sotto)\n" +
                    "- Monitorare CPK, AST e ALT\n" +
                    "- Elevata capcaità di penetrare il biofilm, ma mai in monoterapia\n" +
                    "- ⚠\uFE0F La terapia della tubercolosi non è qui riportata\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Teicoplanina",
            dosaggioRegolare = "Carico per 3-5 dosi, poi mantenimento. Il dosaggio varia in base alla sede dell'infezione",
            dosaggiParticolari = "• Infezioni tessuti molli, IVU, polmoniti: carico 6mg/Kg ogni 12 ore per 3 dosi, mantenimento 6mg/Kg\n" +
                                 "• Osteomielite o infezioni articolari: 12mg/Kg ogni 12 ore per 3-5 dosi, mantenimento 12mg/Kg\n" +
                                 "• Endocardite: 12mg/Kg ogni 12 ore per 3-5 dosi, mantenimento 12mk/Kg\n" +
                                 "• C. difficile: 100-200mg ogni 12 ore PER OS per 7-14gg",
            soluzioniDiluizione = "Soluzione fisiologica 0.9% o glucosata 5% o Ringer o Ringer lattato",
            volumeInfusione = "100 ml",
            tempoInfusione = "30 minuti",
            adattamentiRenali = "• ClCr ≥ 80 ml/min: Dose standard\n • ClCr 30-80 ml/min: Carico standard, 1/2 dose di mantenimento\n• ClCr < 30 ml/min: Carico standard, 1/3 dose di mantenimento\n• Emodialisi: Carico standard, 1/3 dose di mantenimento",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Teicoplanina)"),
            note =  "- Il Sanford consiglia di mantenere la stessa dose di mantenimento ma allungare l'intervallo delle dosi a 48h (ClCr 30-80 ml/min) o 72h (ClCr <30 ml/min)\n" +
                    "- Monitorare la concentrazione a valle:\n" +
                    "   • Infezioni tessuti molli, IVU, polmoniti: > 15 μg/ml\n" +
                    "   • Osteomielite o infezioni articolari: > 20 μg/ml\n" +
                    "   • Endocardite: > 30 μg/ml\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Tigeciclina",
            dosaggioRegolare = "100mg dose di carico, poi 50mg ogni 12 ore EV",
            dosaggiParticolari = "In infezioni da Gram- MDR carico 200mg, manntenimento 100mg",
            soluzioniDiluizione = "Soluzione fisiologica 0.9% o glucosata 5% o Ringer lattato",
            volumeInfusione = "100 ml",
            tempoInfusione = "30-60 minuti",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "In Child-Pugh C: ridurre la dose di mantenimento a 25 mg",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Tigeciclina)"),
            note = "- Non attiva su Pseudomonas\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Tobramicina",
            dosaggioRegolare = "Carico 2mg/kg, mantenimento 1.7-2mg/kg ogni 8 ore",
            dosaggiParticolari = "Possibile il dosaggio esteso: 7 mg/Kg/die",
            soluzioniDiluizione = "Soluzione fisiologica 0.9% o glucosata 5%",
            volumeInfusione = "Max 1 mg/ml",
            tempoInfusione = "60 minuti",
            adattamentiRenali = "• ClCr > 50 ml/min: Dose standard\n• ClCr 10-50 ml/min: 1.7-2mg/kg ogni 12-24 ore\n• ClCr < 10 ml/min: 1.7-2mg/kg ogni 48 ore\n• Emodialisi: 1.7-2mg/kg ogni 48 ore, più dose aggiuntiva 0.85-1 mg/kg dopo la dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Tobramicina)"),
            note = "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Trimetoprim/Sulfametossazolo EV",
            dosaggioRegolare = "10-20mg/kg/die (TMP) EV suddivisi in 2-4 dosi",
            dosaggiParticolari = "Pneumocistosi: 15-20mg/kg/die (trimetoprim) EV in 3-4 dosi.",
            soluzioniDiluizione = "Soluzione fisiologica 0.9% o glucosata 5%",
            volumeInfusione = "1 fl in 125 ml; 2 fl in 250 ml; 3-4 fl in 500 ml",
            tempoInfusione = "30-90 minuti (in base al volume)",
            adattamentiRenali = "• ClCr ≥ 30 ml/min: Dose standard\n• ClCr 10-29 ml/min: 5-10 mg/kg/die divisi ogni 12 ore\n• ClCr < 10 ml/min: Se possibile evitare. Se usato 5-10mg/kg ogni 24 ore\n• Emodialisi: Se possibile evitare. Se usato 5.10mg/kg ogni 24 ore (somm. dopo la dialisi)",
            adattamentiEpatici = "• RCP: Usare con cautela in insufficienza epatica grave\n" +
                                 "• Sanford: Non necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Trimetoprim+Sulfametossazolo)"),
            note =  "- I valori dei dosaggi fanno riferimento al Trimetoprim (TMP)\n" +
                    "- Regolare monitoraggio emocromo\n" +
                    "- Rischio di sdr. Stevens-Johnson\n" +
                    "- Posologia e adattamenti renali hanno il Sanford come fonte\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Trimetoprim/Sulfametossazolo per OS",
            formulazioneOrale = "Compresse 160mg+800mg, sospensione orale",
            dosaggioRegolare = "≤ 100 kg: 160mg+800mg (1cp) ogni 12 ore\n" +
                               "> 100 kg: 160mg+800mg (1cp) ogni 8 ore",
            dosaggiParticolari = "• Pneumocistosi: 20mg/kg/die (TMP) suddivisi ogni 6 ore\n" +
                                 "• Profilassi Pneumocistis: 1 cp/die o 3 cp/settimana",
            adattamentiRenali = "• ClCr ≥ 30 ml/min: Dose standard\n• ClCr 15-30 ml/min: Metà dose\n• ClCr < 15 ml/min: Evitare se possibile",
            adattamentiEpatici = "• RCP: Usare con cautela in insufficienza epatica grave\n" +
                                 "• Sanford: Non necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Trimetoprim+Sulfametossazolo)"),
            note =  "- Adattamenti renali presi dalla scheda RCP\n" +
                    "- Regolare monitoraggio emocromo\n" +
                    "- Rischio di sdr. Stevens-Johnson e DRESS\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Vancomicina EV",
            dosaggioRegolare = "Carico 25-30mg/kg (max 3g), poi 15-20 mg/kg ogni 8-12 ore EV",
            dosaggiParticolari = "Infusione continua: carico 15-20 mg/kg, subito dopo iniziare l'infusione continua a 30-40 mg/kg/die",
            soluzioniDiluizione = "Soluzione fisiologica 0.9% o glucosata 5% o Ringer lattato",
            volumeInfusione = "Max 10 mg/ml",
            tempoInfusione = "Almeno 60 minuti per 1g (max 10 mg/min). Meglio in infusione continua",
            adattamentiRenali = "• ClCr > 100 ml/min: Dose standard\n• ClCr 51-100 ml/min: 15-20 mg/kg ogni 12 ore\n• ClCr 20-50 ml/min: 15-20 mg/kg ogni 24 ore\n• ClCr < 20 ml/min: 15-20 mg/kg ogni 48 ore\n• Emodialisi: Secondo livelli plasmatici, spesso 500 mg dopo ogni dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Vancomicina)"),
            note =  "- Monitoraggio con TDM Vancomicina:\n" +
                    "   • Infusione continua: 20-25 mg/l\n" +
                    "   • Infusione intermittente: 10-20 mg/l\n" +
                    "- L'infusione continua sembra aver minor rischio di nefrotossicità\n" +
                    "- L'infusione continua si può suddividere in 2 dosi della durata di 12 ore\n" +
                    "- Antibiotico più frequentemente associato a sdr Stevens-Johnson e DRESS\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Vancomicina per OS",
            dosaggioRegolare = "125mg ogni 6 ore",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Vancomicina)"),
            note =  "- Solo per trattamento della colite da Clostridium difficile\n" +
                    "- Prelevare da un flaconcino della soluzione da infusione\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Voriconazolo",
            dosaggioRegolare = "6mg/kg ogni 12 ore (2 dosi), poi 4mg/kg ogni 12 ore EV",
            soluzioniDiluizione = "Soluzione glucosata 5%",
            adattamentiRenali = "Non sono necessari aggiustamenti (ma evitare EV se ClCr < 50 ml/min)",
            adattamentiEpatici = "Ridurre la dose in caso di insufficienza epatica moderata-grave",
            tempoInfusione = "120 minuti",
            dosaggioOrale = "200mg ogni 12 ore",
            formulazioneOrale = "Compresse, sospensione",
            dosaggiParticolari = "Aspergillosi invasiva, infezioni fungine resistenti.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Voriconazolo)"),
            volumeInfusione = "100-200 ml (minimo 100 ml)"
        )
    )
} 