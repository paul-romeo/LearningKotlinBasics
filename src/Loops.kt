fun main() {
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")

    // Display every item in the rebels list
    for (rebel in rebels) {
        println(rebel)
    }

    // Display key (character) and value (vehicle) of the rebelVehicles hashMap
    for ((character, vehicle) in rebelVehicles) {
        println("$character gets around in the $vehicle")
    }

    var x = 10
    while (x  > 0) {
        print("$x ")
        x--
    }
}