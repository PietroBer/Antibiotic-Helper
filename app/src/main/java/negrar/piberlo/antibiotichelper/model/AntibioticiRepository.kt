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
            dosaggioRegolare = "Adulto: 4-6 mg/kg ogni 24 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "• ClCr < 30 ml/min: ogni 48 ore",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "30 minuti",
            dosaggiParticolari = "Batteriemie, endocarditi da Stafilococco resistente. Non usare in polmoniti.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Daptomicina)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Doxiciclina",
            dosaggioRegolare = "100mg ogni 12 ore EV o per os",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Usare con cautela in insufficienza epatica grave",
            tempoInfusione = "60 minuti",
            dosaggioOrale = "100mg ogni 12 ore",
            formulazioneOrale = "Compresse, capsules",
            dosaggiParticolari = "Malattia di Lyme, infezioni da rickettsie, polmoniti atipiche.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Doxiciclina)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Ertapenem",
            dosaggioRegolare = "Adulto: 1g ogni 24 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%) o glucosata 5%",
            adattamentiRenali = "• ClCr > 30 ml/min: dose standard (1g ogni 24 ore)\n• ClCr ≤ 30 ml/min: 500mg ogni 24 ore\n• Emodialisi: 500mg ogni 24 ore, somministrare dopo dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "30 minuti",
            dosaggiParticolari = "Non raccomandato per infezioni da Pseudomonas o Acinetobacter.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Ertapenem)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Fluconazolo",
            dosaggioRegolare = "Adulto: 400mg dose di carico, poi 200-400mg ogni 24 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%) o glucosata 5%",
            adattamentiRenali = "• ClCr < 50 ml/min: dimezzare la dose",
            adattamentiEpatici = "Usare con cautela in insufficienza epatica grave",
            tempoInfusione = "30-60 minuti",
            dosaggiParticolari = "Candidemie, meningite criptococcica.",
            dosaggioOrale = "200-400mg ogni 24 ore",
            formulazioneOrale = "Compresse, sospensione",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Fluconazolo)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Fosfomicina",
            dosaggioRegolare = "4-8g ogni 6-8 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "• ClCr < 40 ml/min: 4g ogni 12 ore\n• Emodialisi: 4g dopo dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "60 minuti",
            dosaggioOrale = "3g dose singola",
            formulazioneOrale = "Bustine",
            dosaggiParticolari = "Infezioni urinarie complicate, infezioni da batteri multiresistenti.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Fosfomicina)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Gentamicina",
            dosaggioRegolare = "Adulto: 5-7 mg/kg/die EV in unica somministrazione (o 1,5-2 mg/kg ogni 8 ore)",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "• ClCr > 60 ml/min: dose standard\n• ClCr 30-60 ml/min: 3 mg/kg/die\n• ClCr < 30 ml/min: 2 mg/kg/die\n• Emodialisi: dose secondo livelli plasmatici",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "30-60 minuti",
            dosaggiParticolari = "Endocardite: 3 mg/kg/die in 2-3 somministrazioni. Monitorare livelli plasmatici.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Gentamicina)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Imipenem",
            dosaggioRegolare = "Adulto: 500mg-1g ogni 6-8 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "• ClCr > 70 ml/min: dose standard (500mg-1g ogni 6-8 ore)\n• ClCr 41-70 ml/min: 500mg ogni 6 ore\n• ClCr 21-40 ml/min: 250-500mg ogni 6-8 ore\n• ClCr 6-20 ml/min: 250mg ogni 8-12 ore\n• ClCr ≤ 5 ml/min: controindicato\n• Emodialisi: 250-500mg ogni 12 ore dopo dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "20-30 minuti",
            dosaggiParticolari = "Meningite: 1g ogni 6 ore EV.",
            note = "Rischio di slatentizzazione di crisi epilettiche.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Imipenem)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Isavuconazolo",
            dosaggioRegolare = "Adulto: dose di carico 200mg ogni 8 ore per 6 dosi, poi 200mg ogni 24 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%) o glucosata 5%",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Usare con cautela in insufficienza epatica grave",
            tempoInfusione = "60 minuti",
            dosaggiParticolari = "Aspergillosi invasiva, mucormicosi.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Isavuconazolo)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Levofloxacina",
            dosaggioRegolare = "Adulto: 500-750mg ogni 24 ore EV",
            dosaggiParticolari = "Polmonite nosocomiale: 750mg ogni 24 ore EV.",
            dosaggioOrale = "Stessa posologia ev. 500-750mg ogni 24 ore",
            formulazioneOrale = "Compresse rivestite divisibili",
            soluzioniDiluizione = "Soluzione precostituita da 500mg in 100 ml (5mg/ml)\nSoluzione fisiologica (NaCl 0,9%) o glucosata 5%",
            volumeInfusione = "100 ml (minimo 100 ml)",
            tempoInfusione = "60 minuti",
            adattamentiRenali = "• ClCr > 50 ml/min: dose standard (500-750mg ogni 24 ore)\n• ClCr 20-49 ml/min: carico 500mg, poi 250mg ogni 24 ore\n• ClCr < 20 ml/min: 500mg iniziale, poi 250mg ogni 48 ore\n• Emodialisi: 500mg iniziale, poi 250mg ogni 48 ore",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Levofloxacina)"),
            note = "- Monitoraggio QTc\n" +
                    "- Rischio di tendinite, rottura di tendine e neuropatie.\n" +
                    "- Può causare disturbi del sonno"
        ),
        Antibiotico(
            nome = "Linezolid",
            dosaggioRegolare = "Adulto: 600mg ogni 12 ore EV",
            soluzioniDiluizione = "Soluzione precostituita 300ml",
            formulazioneOrale = "Compresse, non frantumabili",
            dosaggioOrale = "600mg (1 cp) ogni 12 ore",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "30-120 minuti",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Linezolid)"),
            note = "- Monitorare emocromo per rischio mielotossicità.\n" +
                    "- Verificata ✅"
        ),
        Antibiotico(
            nome = "Meropenem",
            dosaggioRegolare = "1g ogni 8 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "• ClCr > 50 ml/min: 1g ogni 8 ore\n• ClCr 26-50 ml/min: 1g ogni 12 ore\n• ClCr 10-25 ml/min: 0,5g ogni 12 ore\n• ClCr < 10 ml/min: 0,5g ogni 24 ore\n• Emodialisi: 0,5g ogni 24 ore, aggiungere 0,25g dopo ogni dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "15-30 minuti (ideale: 3 ore in infusione prolungata)",
            dosaggiParticolari = "In caso di meningite o polmonite in fibrosi cistica, la dose raccomandata è 2g ogni 8 ore EV.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Meropenem)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Meropenem/Vaborbactam",
            dosaggioRegolare = "2g/2g ogni 8 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "• ClCr > 50 ml/min: dose standard\n• ClCr 30-49 ml/min: 1g/1g ogni 8 ore\n• ClCr 15-29 ml/min: 1g/1g ogni 12 ore\n• ClCr < 15 ml/min: non raccomandato",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "180 minuti",
            dosaggiParticolari = "Infezioni complicate da Enterobacteriaceae resistenti (KPC).",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Meropenem+Vaborbactam)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Metronidazolo",
            dosaggioRegolare = "Adulto: 500mg ogni 8-12 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%) o glucosata 5%",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Ridurre la dose in caso di grave insufficienza epatica",
            tempoInfusione = "30-60 minuti",
            dosaggiParticolari = "Colite da Clostridioides difficile: 500mg ogni 8 ore per via orale.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Metronidazolo)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Micafungina",
            dosaggioRegolare = "100mg ogni 24 ore EV (fino a 200mg in infezioni invasive)",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%) o glucosata 5%",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "60 minuti",
            dosaggiParticolari = "Candidemia, profilassi in pazienti ematologici.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Micafungina)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Oxacillina",
            dosaggioRegolare = "Adulto: 2g ogni 4-6 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Usare con cautela in insufficienza epatica grave",
            tempoInfusione = "60 minuti",
            dosaggiParticolari = "Endocardite da Stafilococco sensibile: 2g ogni 4 ore EV.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Oxacillina)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Piperacillina/Tazobactam",
            dosaggioRegolare = "Adulto: 4g/0,5g ogni 8 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "• ClCr > 40 ml/min: dose standard (4g/0,5g ogni 8 ore)\n• ClCr 20-40 ml/min: 4g/0,5g ogni 12 ore\n• ClCr < 20 ml/min: 2g/0,25g ogni 12 ore\n• Emodialisi: 2g/0,25g ogni 8 ore durante i giorni senza dialisi; aggiungere 0,75g/0,094g dopo ogni seduta di dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti significativi",
            tempoInfusione = "30 minuti (ideale: 3-4 ore in infusione prolungata)",
            dosaggiParticolari = "In caso di infezioni da Pseudomonas o in pazienti critici, può essere considerata l'infusione prolungata (4g/0,5g in 3-4 ore ogni 8 ore).",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Piperacillina+Tazobactam)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Polimixina B",
            dosaggioRegolare = "1,5-2,5 mg/kg/die EV in 2 dosi",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "Non sono necessari aggiustamenti (ma monitorare funzione renale)",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "60 minuti",
            dosaggiParticolari = "Infezioni da Gram-negativi multiresistenti. Monitorare funzione renale e neurologica.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Polimixina+B)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Posaconazolo",
            dosaggioRegolare = "300mg ogni 24 ore EV (dopo dose di carico 300mg ogni 12 ore per 2 dosi)",
            soluzioniDiluizione = "Soluzione glucosata 5%",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Usare con cautela in insufficienza epatica grave",
            tempoInfusione = "90 minuti",
            dosaggioOrale = "300mg ogni 24 ore",
            formulazioneOrale = "Compresse, sospensione",
            dosaggiParticolari = "Profilassi e trattamento di infezioni fungine invasive (aspergillosi, mucormicosi).",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Posaconazolo)"),
            volumeInfusione = "250 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Rifampicina",
            dosaggioRegolare = "600mg ogni 24 ore EV o per os",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Ridurre la dose in caso di insufficienza epatica grave",
            tempoInfusione = "30 minuti",
            dosaggioOrale = "600mg ogni 24 ore",
            formulazioneOrale = "Compresse, capsule",
            dosaggiParticolari = "Tubercolosi, infezioni protesiche, sempre in associazione ad altri antibiotici.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Rifampicina)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Teicoplanina",
            dosaggioRegolare = "400mg ogni 12 ore per 3 dosi (carico), poi 400mg ogni 24 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "• ClCr < 60 ml/min: 200-400mg ogni 48 ore",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "30-60 minuti",
            dosaggiParticolari = "Endocarditi, infezioni da MRSA, osteomieliti. Monitorare livelli plasmatici.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Teicoplanina)"),
            volumeInfusione = "100 ml (minimo 50 ml)"
        ),
        Antibiotico(
            nome = "Tigeciclina",
            dosaggioRegolare = "100mg dose di carico, poi 50mg ogni 12 ore EV",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%) o glucosata 5%",
            adattamentiRenali = "Non sono necessari aggiustamenti",
            adattamentiEpatici = "Usare con cautela in insufficienza epatica grave",
            tempoInfusione = "30-60 minuti",
            dosaggiParticolari = "Infezioni complicate addominali, cutanee, polmoniti. Non attiva su Pseudomonas.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Tigeciclina)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Tobramicina",
            dosaggioRegolare = "5-7 mg/kg/die EV in unica somministrazione",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%)",
            adattamentiRenali = "• ClCr 30-60 ml/min: 3 mg/kg/die\n• ClCr < 30 ml/min: 2 mg/kg/die\n• Emodialisi: dose secondo livelli plasmatici",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "30-60 minuti",
            dosaggiParticolari = "Infezioni gravi da Gram-negativi, Pseudomonas. Monitorare livelli plasmatici.",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Tobramicina)"),
            volumeInfusione = "100-200 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Trimetoprim/Sulfametossazolo",
            dosaggioRegolare = "Adulto: 160/800mg (1 cpr) ogni 12 ore per os o 5-10mg/kg/die (trimetoprim) EV in 2-4 dosi",
            soluzioniDiluizione = "Soluzione glucosata 5%",
            adattamentiRenali = "• ClCr 15-30 ml/min: metà dose\n• ClCr < 15 ml/min: evitare se possibile",
            adattamentiEpatici = "Usare con cautela in insufficienza epatica grave",
            tempoInfusione = "60-90 minuti",
            dosaggiParticolari = "Pneumocistosi: 15-20mg/kg/die (trimetoprim) EV in 3-4 dosi.",
            dosaggioOrale = "160/800mg ogni 12 ore",
            formulazioneOrale = "Compresse",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Trimetoprim+Sulfametossazolo)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
        ),
        Antibiotico(
            nome = "Vancomicina",
            dosaggioRegolare = "Adulto: 15-20 mg/kg ogni 8-12 ore EV (dose iniziale tipica 1g ogni 12 ore)",
            soluzioniDiluizione = "Soluzione fisiologica (NaCl 0,9%) o glucosata 5%",
            adattamentiRenali = "• ClCr > 50 ml/min: dose standard\n• ClCr 20-49 ml/min: 15-20 mg/kg ogni 24 ore\n• ClCr < 20 ml/min: dose secondo livelli plasmatici\n• Emodialisi: dose secondo livelli plasmatici, spesso 500 mg dopo ogni dialisi",
            adattamentiEpatici = "Non sono necessari aggiustamenti",
            tempoInfusione = "Almeno 60 minuti per 1g (max 10 mg/min)",
            dosaggiParticolari = "Endocardite, osteomielite, meningite: target livelli plasmatici più elevati (15-20 mg/L).",
            linkUtili = listOf("[Cerca RCP su Google](https://www.google.com/search?q=RCP+Vancomicina)"),
            volumeInfusione = "100 ml (minimo 100 ml)"
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