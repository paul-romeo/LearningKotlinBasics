fun main() {
    // Unique features of Kotlin including FP (Functional Programming)
    // 0. Type inference
    // 1. Single express function
    // 2. String interpolation
    // 3. High order function 1: fun b accepts fun a as paramter
    // 4. High order function 2: fun c returns fun a
    // 5. Lambda expression val a = {parameter -> body function}
    //    Notes:
    //    a. The last statement in the body will be the return value
    // 6. Map function returns the list having the same number of items as in the original list BUT may contains different values
    // 7. Filter function returns the list containing ONLY items that meet the criteria
    // 8. Aggregate functions: count(), maxOrNull(), minOrNull(), average(), sum()
    // 9. Comparators
    // 10. Sum with calculation: sumBy(), sumByDouble()
    // 11. Reduce() used to reduce list of numbers into one final value
    // 12. Fold() similar to reduce, but can change the value of each element before perform the operation
    // 13. flatMap()
    // 14. Chaining functions
    // 15. Extend function to class
    // 16. Safe around null string



    // 0. Type inference (type doesn't need to defined)
    val a = "Copenhagen"  // val a: String = "Copenhagen"
    // 1. Single expression function
    fun conference2() = "Kotlin Conference"
    // equivalent to the traditional way
    fun conference(): String {
        return "Kotlin Conference"
    }
    println(conference())
    println(conference2())
    fun addTwo(a: Int, b: Int) = a + b
    println(addTwo(3, 4))

    // 2. String interpolation
    println("${conference()} is the best one!")

    // High order functions: fun b can accepts fun a as parameter
    fun a(): String {
        return "I can have functions"
    }

    fun b(param: () -> String): String {  // param: () indicates that the param is a function
        return param()
    }
    // fun b accepts fun a (has been defined) as parameter
    println(b(::a))

    // 3. High order function: fun c return fun a
    fun c(): () -> String {
        return ::a      // fun a is defined somewhere
    }

    // 4. High order function: fun c makes fun a as returned value
    val myReturnedFunction = c()
    println(myReturnedFunction())

    // another way to return function
    // by calling fun c() where fun c will return a function
    println(c()())

    // 5. Lambda expression...
    // Traditional way to define a function
    fun hello(name: String) {
        println("Hello, $name")
    }
    hello("Paul")

    // Lambda way to define a function
    // Notes:
    // a. Parameter is what defines to the left of ->
    // b. Body or processing part is what defines to the right of ->
    var hello = { name: String -> println("Hello, $name") }
    hello("Matt")

    // 6. Map function: process each item in the list and return the same number of items having different values
    // Traditional way:
    fun plusFive(): List<Int> {
        val numList = listOf(1, 2, 3, 4)
        return numList.map { it + 5 }
    }
    println(plusFive())

    // The last line is the return value
    val plusFiveLambda = { ->
        val numList = listOf(1, 2, 3, 4)
        numList.map{it + 6}
    }

    println(plusFiveLambda())

    // 7. Filter function: process each item and returns a list of ONLY items met the criteria
    fun filterGreaterThan2(): List<Int> {
        val numList = listOf(1, 2, 3, 4)
        return numList.filter { it > 2 }
    }
    println(filterGreaterThan2())

    // The last line is the return value
    val filterGreaterThan2Lambda = { ->
        val numList = listOf(1, 2, 3, 4)
        numList.filter { it > 1 }
    }
    println(filterGreaterThan2Lambda())

    // 8. Collection Aggregate Operations
    val numbers = listOf(6, 42, 10, 4)

    println("Count: ${numbers.count()}")    // returns # of items
    println("Max: ${numbers.maxOrNull()}")
    println("Min: ${numbers.minOrNull()}")
    println("Average: ${numbers.average()}")
    println("Sum: ${numbers.sum()}")

    // 9. Comparators
    val numbersList = listOf(5, 42, 10, 4)
    val min3Remainder = numbersList.minByOrNull { it % 3 }  // '42' has the smallest remainder value (=0)
    println(min3Remainder)

    val strings = listOf("one", "two", "three", "four")
    val longestString = strings.maxWithOrNull(compareBy { it.length })   // 'Three' has the highest # of characters
    println(longestString)

    // 10. Sum with calculation
    val numbersList2 = listOf(5, 42, 10, 4)
    println(numbersList2.sumBy { it * 2 })  // returns sum then x 2
    println(numbersList2.sumByDouble { it.toDouble() / 2 }) // converts to double then divide by 2

    // 11. Reduce function to reduce list of numbers into one final value
    //     Notes:
    //     a. To apply a function to elements in the reverse order, use reduceRight()
    //     b. Others: reduceOrNull(), reduceRightOrNull(), reduceIndexOrNull(), reduceOrNull()
    val numbersList3 = listOf(5, 2, 10, 4)

    val sum = numbersList3.reduce { sum, element -> sum + element}  // 21 = adding each element values to the sum     println(sum)

    // 12. Use fold() when expecting to change the value of the element before summing them
    //     Note:
    //     a. To apply a function to elements in the reverse order, use foldRight()
    //     b. Others: foldIndexed(), foldRightIndexed()
    val sumDoubled = numbersList3.fold(0) { sum, element -> sum + (element - 2) } // 42 = sum of each (element value x 2)
    println(sumDoubled)


    // Observation: it appears that functions fold() are more powerful than reduce()

    // 13. flatMap() flattens 2-dimension list into a one-dimension list
    //     Note: 'it' is an element
    val list = listOf(listOf(1, 2, 3), listOf(4, 5), listOf(6, 7))
    println(list.flatMap { it.toList() }) // [1, 2, 3, 4, 5]

    // 14. Chaining functions: linking 3 functions filter, map, and forEach
    //     The order of processing is from left to right
    val numbersList5 = 1 .. 100
    println(numbersList5.filter{it % 5 == 0}.map{it * 20}.forEach{print("$it ")})

    // 15. Extend function to class
    fun String.isSameAs(value: String) = this == value
    println("Me".isSameAs("Me"))

    // 16. Safe with null string
    var s: String? = ""
//    s = null
    println(s?.length) // Display null or the actual length

//    import arrow.core.* // why not working ?
//    fun processRequest(input: String): Option<String> {
//        if (input.contains("valid")) {
//            return Option("All good!")
//        } else {
//            return Option.empty()
//        }
//    }
//
//    val result = processRequest("This is a valid request")
//    if (result.isDefined()) println("There is a value ")

} // main

