fun main() {
    var str = "May the force be with you"
    println(str)

    // Other common types of escape characters:
    //   \n, \t, \b (backspace), \r (carriage return
    //   \\ (backlash), \$ (dollar sign)
    var str1 = "My dad said the funniest thing. He said \"A joke\""
    println(str1)

    // Multi-lines string with 3 pairs of double-quotation marks
    // default trimMargin() is |
    val rawCrawl = """A long time ago, 
        |in a galaxy 
        |far, far away... 
        |BUM BUMM BUMMM
    """.trimMargin()
    println(rawCrawl)

    // Display individual characters
    for (char in str) {
        print(char + " ")
    }
    println()

    // String operations
    println(str.contentEquals("May the force be with you"))

    println(str.contains("force", true))

    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()
    println(uppercase)
    println(lowercase)

    val num = 6
    var stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4, 13)
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27
    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle")
    println("Lukes full name \"$luke\" has ${luke.length} characters")




    
    







}