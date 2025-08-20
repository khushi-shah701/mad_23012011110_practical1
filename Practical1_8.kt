import java.util.Arrays
fun main() {
    val array1 = arrayOf(10, 90, 60, 80, 100)
    println("Array-1 (arrayOf): ${array1.joinToString()}")

    val array2 = Array(5) { 0 }
    println("Array-2 (Array<T>): ${array2.joinToString()}")

    val array3 = Array(8) { it }
    println("Array-3 (Array<T> with lambda): ${array3.joinToString()}")

    val array4 = IntArray(5)
    println("Array-4 (IntArray): ${array4.joinToString()}")

    val array5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("Array-5 (intArrayOf): ${array5.joinToString()}")

    val array6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("Array-6 (2D Array using arrayOf + intArrayOf):")
    println("Using Arrays.deepToString(): ${Arrays.deepToString(array6)}")
    println("Using contentDeepToString(): ${array6.contentDeepToString()}")

    val arr = IntArray(5)
    println("Please enter 5 integer values:")
    for (i in arr.indices) {
        print("arr[$i] = ")
        arr[i] = readln().toInt()
    }
    println("Entered Array: ${arr.toList()}")

    println("===== Loop Types =====")

    println("Range (1..5):")
    for (i in 1..5) print("$i ")
    println()

    println("DownTo (5 downTo 1):")
    for (i in 5 downTo 1) print("$i ")
    println()

    println("Until (0 until arr.size):")
    for (i in 0 until arr.size) print("${arr[i]} ")
    println()

    println("Step (0..10 step 2):")
    for (i in 0..10 step 2) print("$i ")

    println("===== Sorting =====")

    val original = intArrayOf(56, 23, 49, 12, 2)

    println("Original Array: ${original.joinToString()}")

    println("-- With Built-in Function --")
    val builtInSorted = original.sortedArray()
    println("Sorted: ${builtInSorted.joinToString()}")

    println("-- Without Built-in Function (Bubble Sort) --")
    val manualSorted = original.copyOf()
    bubbleSort(manualSorted)
    print("Sorted: ${manualSorted.joinToString()}")
}

fun bubbleSort(arr: IntArray): IntArray {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}