fun main() {
    // name cannot be nullable
    var name: String = "PaulR"

    // Place a ? after type for a nullable variable
    var nullableName: String? = "Do I really exist?"
    println(nullableName)
//    println(nullableName.length)  // result an error because the variable can be nullable

    // One way to resolve problem by verifying that the nullableName is not null first
    nullableName = null
    var length = 0
    if (nullableName != null) {
        length = nullableName.length    // no compilable error here
    } else {
        length = -1
    }
    println(length)

    // more concise way to check for nullableName
    val l = if (nullableName != null) nullableName.length else -1

    // Second method: safe call operator?
    println(nullableName?.length)   // will display null

    // 3rd method is to use Elvis operator: shortcut for if-else
    val len = nullableName?.length ?: -1
    println("The length = $len")

    // if nullableName is null then noName = "No one knows about me...
    val noName = nullableName ?: "No one knows about me..."
    println(noName)

    // Use !! only when the nullableName is definitely not null
    nullableName = "I am definitely not null"
    println(nullableName!!.length)  // result run-time error when the nullableName is indeed null




}