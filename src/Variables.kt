fun main() {
    val name = "PaulR"      // the name is immutable
    var isAwesome = true    // isAwesome is mutable
    println("Is " + name + " awesome? The answer is " + isAwesome)

    // Adding numbers
    var a = 3
    var b = 6
    println("The sum of $a and $b is ")
    println(a + b)

    // Types of numbers
    var doubleNum: Double = 123.45  // 64-bit real number
    var floatNum: Float = 123.44f   // 32-bit real number. Note: must ended with "f"
    var longNum: Long = 1234567L     // 64-bit integer number. Note: must be ended with "L"

    // Convert a number to string
    println(a.toString())

    // The content of var can be changed (mutable)
    var hero: String
    hero = "batman"
    hero = "superman"
    println("my favorite hero is $hero")





}