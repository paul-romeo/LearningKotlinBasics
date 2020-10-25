fun main() {

    val a = 2
    val b = 2
    val c = 3
    if (a == b) {
        println("a does in fact equal b")
    }

    if (a != c) {
        println("a does not equal c")
    }

    // if-else
    val accountBalance = 100
    val price = 150
    if (accountBalance >= price) {
        println("You can buy this!")
    } else {
        println("Sorry, you broke!")
    }

    // if, else if, else
    val degrees = 20
    if (degrees >= 70) {
        println("This is some nice weather")
    } else if (degrees < 70 && degrees >= 50) {
        println("Grab a sweater")
    } else {
        println("Holy crap, it's cold")
    }

    // boolean. note: ! = not
    val isHungry = false
    val isBored = true
    if (!isHungry || isBored) {
        println("Let's get pizza!")
    }

    // switch with when
    val x = 34
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> println("x is neither to 1 nor 2")
    }

    fun vaderisFeeling(mood: String="angry") {
        if (mood == "angry") {
            println("run for the hills, Vader is $mood")
        } else {
            println("whatever you do, don't make him angry")
        }
    }

    vaderisFeeling("happy")

}