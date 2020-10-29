fun main() {
    // lambda printMessage
    val printMessage = {message: String -> println(message)}
    printMessage("Hello World!")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(5, 3))

    // Another way to write lambda expression:
    // it requires more typing but seems  to see the structure before the implementaton
    val sumB: (Int, Int) -> Int = {x, y -> x + y}
    println(sumB(5, 3))

}