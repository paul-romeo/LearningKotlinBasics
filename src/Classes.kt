// Only open class can be inherited
open class Vehicle(val make: String, val model: String) {
    // Only open fun can be overriden
    open fun accelerate() {
        println("vroom vroom...")
    }

    fun park() {
        println("Parking the vehicle")
    }

    fun stop() {
        println("STOP!")
    }
}

class Car(make: String, model: String, val color: String): Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludrious made!")

        super.accelerate()  // call the vehicle accelerate() method
    }
}
class Truck(make: String, model: String, val towingCapacity: Int): Vehicle(make, model) {
    fun tow() {
        println("Headed out to the mountains!")
    }

}

fun main() {
    val tesla = Car("Tesla", "ModelS", "Red")
    println(tesla.make)
    println(tesla.model)
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 10000)
    truck.tow()

}