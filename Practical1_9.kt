fun main(){
    val a = ArrayList<Int>()
    for (i in 0..4) {
        val b = readln().toInt()
        a.add(b)
    }

    for (i in 0..4) {
        println("a[$i]=${a[i]}")
    }

    var max = a[0]
    for (i in 1..4) {
        if (a[i] > max) {
            max = a[i]
        }
    }
    print("Largest element = $max")
}