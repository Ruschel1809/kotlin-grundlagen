fun calculateDiscount( gesamtbetrag : Double, alter : Int) : Double {
    val rabat = when {
        alter < 18 -> gesamtbetrag * 0.1
        alter >= 65 -> gesamtbetrag * 0.15
        else -> 0.0
    }
    return gesamtbetrag - rabat
}

fun main(){
    print("Bitte geben Sie den Gesamtbetrag des Einkaufs ein: ")
    val betragString = readLine()
    print("Bitte geben Sie das Alter des Käufers ein: ")
    val alterString = readLine()

    val betrag = betragString?.toDoubleOrNull()
    val alter = alterString?.toIntOrNull()
    if(betrag != null && alter != null){
        println("Für einen Kunden im Alter von $alter, ergibt sich aus dem Einkaufswert von €$betrag nach Abzug der Rabatts eine Summe von €${calculateDiscount(betrag,alter)}")
    }

}

main()