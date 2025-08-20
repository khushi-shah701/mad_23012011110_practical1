fun main() {
    print("Enter Number: ")
    var x=readln().toInt()
    var y = fact(x)
    var z = factorialTailRec(x)
    println("Factorial of $x = $y")
    println("By TailRec Keyword, Factorial of $x = $z")
}
fun fact(x: Int) :Long{
    return if (x == 0) {
        1
    } else {
        x * fact(x - 1)
    }
}
tailrec fun factorialTailRec(n: Int, a: Int = 1): Int {
    return if (n == 0 || n == 1) {
        a
    } else {
        factorialTailRec(n - 1, n * a)
    }
}