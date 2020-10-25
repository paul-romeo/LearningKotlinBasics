fun main() {

    fun forceChoke() {
        println("You have failed me the last time Admiral...")
    }

    // call the function
    forceChoke()

    // function with parameter
    fun makeAnEntrance(line: String) {
        println(line)
    }

    makeAnEntrance("I find your lack of faith disturbing.")

    // function with returned value
    fun calculateNumberOfGoodGuys(rebels: Int, ewoks: Int): Int {
        val goodGuys = rebels + ewoks
        return goodGuys
    }

    val rebels = calculateNumberOfGoodGuys(4, 6)
    println("Darth Vader faced off against $rebels rebels scum.")
    // call the function directly without having to assign to a variable first
    println("Darth Vader faced off against ${calculateNumberOfGoodGuys(4, 6)} rebels scum.")

    // function with parameter having default value
    fun vaderIsFeeling(mood: String="angry") {
        println(mood)
    }

    println(vaderIsFeeling())           // default value
    println(vaderIsFeeling("meh")) // specify value


}