fun berechneGesamtkosten(produktPreise: List<Double>): Double {
    val mehrwertsteuer = 0.19
    var gesamtkosten = 0.0
    val preisMitMwSt: (Double) -> Double = { preis ->
        preis * (1 + mehrwertsteuer)
    }
    for (preis in produktPreise) {
        gesamtkosten += preisMitMwSt(preis)
    }
    return gesamtkosten
}
// Beispielaufruf
val produktPreise = listOf(10.0, 20.0, 30.0)
val gesamtkosten = berechneGesamtkosten(produktPreise)
println("Gesamtkosten inkl. MwSt: $gesamtkosten")