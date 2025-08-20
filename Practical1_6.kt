fun arithmeticOperations(x: Int, y: Int,z: Int, i: String): Int {
    return when (i) {
        "addition" -> x + y + z
        "subtraction" -> x - y - z
        "multiplication" -> (x) * (y) * (z)
        "division" -> {
            if (x != 0) {
                y/x
            } else {
                println("Cannot divide by zero")
                return 0
            }
        }
        else -> {
            println("Invalid operation ")
            return 0
        }
    }
}

fun main() {
    print("Enter Number1: ")
    val x = readln().toInt()
    print("Enter Number2: ")
    val y = readln().toInt()
    print("Enter Number3: ")
    val z = readln().toInt()
    println("Addition of $x, $y, $z is ${arithmeticOperations(x, y, z, "addition")}")
    println("Subtraction of $x, $y, $z is ${arithmeticOperations(x, y, z, "subtraction")}")
    println("Multiplication of $x, $y, $z is ${arithmeticOperations(x, y, z, "multiplication")}")
    println("Division of $y, $x is ${arithmeticOperations(x, y, z, "division")}")
}