fun main() {
    // a) Deklaration von val und var
    val bookName = "1984"
    var publicationYear = 1949

    // b) Deklaration verschiedener Datentypen
    val age: Int = 30
    val temperature: Double = 22.5
    val isLightOn: Boolean = true
    val sentence: String = "Kotlin ist großartig!"

    // c) Änderung des Veröffentlichungsjahres
    publicationYear = 1983

    // d) Ausgabe der Variablen

    println("Buchname: $bookName")
    println("Veröffentlichungsjahr: $publicationYear")
    println("Alter: $age")
    println("Temperatur: $temperature")
    println("Ist das Licht an? $isLightOn")
    println("Satz: $sentence")
}
main()