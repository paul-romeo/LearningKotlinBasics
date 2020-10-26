fun main() {

    // Immutable array: listOf (letter "l" in lower case)
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")

    // Display ...
    println(imperials)
    // Display the sorted list in ascending order
    println(imperials.sorted())
    // Display item 3
    println(imperials[2])
    // Display the first and last item of the list
    println(imperials.first())
    println(imperials.last())
    // Display boolean (true or false) if item is in the list
    println(imperials.contains("Emperor"))
    println(imperials.contains("Luke"))


    // Mutable list: arrayListOf()
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println("The original list has ${rebels.size} items")
    println(rebels)
    // Append item to the rebels list
    rebels.add("Chewbacca")
    println("The rebels list after 'Chewbacca' is appended to the list")
    println(rebels)
    // Add item to the beginning of rebels list
    rebels.add(0, "Lando")
    println("The rebels list after 'Lando' is added to the front of the list'")
    println(rebels)
    // Display the index of item in the list
    println(rebels.indexOf("Luke"))
    // Display the rebels list after removing "Han Solo"
    rebels.remove("Han Solo")
    println(rebels)

    // Immutable map ...
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon",
        "Luke" to "Landspeeder")

    // Display value of the specified key
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesn't exist"))
    // Display all values of the rebelVehiclesMap
    println(rebelVehiclesMap.values)
    // Display all keys of the rebelVehiclesMap
    println(rebelVehiclesMap.keys)

    // Mutable map ...
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    // Display the original rebelVehicles list
    println("\nThe original rebelVehicles list: ${rebelVehicles}")
    // Display the rebelVehicles after Luke has changed the vehicle
    rebelVehicles["Luke"] = "XWing"
    println(rebelVehicles)

    // Add vehicle for Leiah
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)

    // Remove "Solo" item from the list
    rebelVehicles.remove("Solo")
    println(rebelVehicles)

    // Clear the rebelVehicles list
    rebelVehicles.clear()
    println("Is the rebelsVehicles list now empty? ${rebelVehicles.isEmpty()}")

    
    


    
}
