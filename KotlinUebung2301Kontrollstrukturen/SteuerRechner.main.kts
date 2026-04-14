fun berechneSteuer(gehalt : Double, steuersatz : Double) : Double {
    var steuer = gehalt * steuersatz
    return steuer
}

fun main(){
    val gehalt = 50000.0
    val steuersatz = 0.3
    var steuer = berechneSteuer(gehalt,steuersatz)
    val bewertung = if(steuer > 10000) "Hohe Steuerlast" else "Moderate Steuerlast"
    println(bewertung)
}

main()