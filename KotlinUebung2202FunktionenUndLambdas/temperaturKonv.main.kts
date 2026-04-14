fun convertTemperature(celsius: Double, logger: (String) -> Unit): Double {
    val fahrenheit = celsius * 9/5 + 32
    logger("Temperaturumrechnung durchgeführt: $celsius°C entspricht $fahrenheit°F")
    return fahrenheit
}

fun main() {
    val logger = { message: String -> println(message) }
    val temp1 = convertTemperature(0.0, logger) // Erwartetes Ergebnis: 32.0°F
    println("Umrechnungsergebnis: $temp1°F")
    val temp2 = convertTemperature(100.0, logger) // Erwartetes Ergebnis: 212.0°F
    println("Umrechnungsergebnis: $temp2°F")
}

main()