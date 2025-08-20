class Car(
    var info: String,
    var price: Double,
    var owner: String,
    var milesDriven: Double
) {
    init {
        println("Object of class is created and Init is called.")
    }

    fun getOriginalPrice(): Double {
        return price
    }

    fun getCurrentPrice(): Double {
        val depreciation = (milesDriven / 1000.0) * 0.05 * price
        return price - depreciation
    }

    fun displayInfo() {
        println("Car Information : $info")
        println("Owner Name     : $owner")
        println("Miles Driven   : $milesDriven")
        println("Original Price : $price")
        println("Current Price  : " + String.format("%.2f", getCurrentPrice()))
    }

    constructor(info: String, price: Double, owner: String) : this (info, price,owner,0.0)
}
fun main() {
    println("Creating Car Class Object car1 in next line")
    val car1 = Car("Honda City", 1200000.0, "Krisha", 15000.0)
    println("== Car 1 Info ==")
    car1.displayInfo()
    println()
    println("Creating Car Class Object car2 in next line")
    val car2 = Car("Maruti", 1800000.0, "Khushi")
    println("== Car 2 Info ==")
    car2.displayInfo()
    println()
    println("******* ArrayList of Car *************")

    val carList = arrayListOf<Car>()

    val car3 = Car("Toyota", 1080000.0, "KJS", 100.00)
    val car4 = Car("Honda", 980000.0, "SRS", 300.00)

    carList.add(car3)
    carList.add(car4)
    println()
    for (car in carList) {
        car.displayInfo()
        println()
    }
}