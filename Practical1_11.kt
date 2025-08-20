class Matrix(val data: Array<IntArray>) {

    val rows = data.size
    val cols = data[0].size

    operator fun plus(matrix2: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.data[i][j] + matrix2.data[i][j]
            }
        }
        return Matrix(result)
    }

    operator fun minus(matrix2: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.data[i][j] - matrix2.data[i][j]
            }
        }
        return Matrix(result)
    }

    operator fun times(matrix2: Matrix): Matrix {
        val result = Array(this.rows) { IntArray(matrix2.cols) }
        for (i in 0 until this.rows) {
            for (j in 0 until matrix2.cols) {
                for (k in 0 until this.cols) {
                    result[i][j] += this.data[i][k] * matrix2.data[k][j]
                }
            }
        }
        return Matrix(result)
    }

    override fun toString(): String {
        var output = ""
        for (row in data) {
            output += row.joinToString(" ") + "\n"
        }
        return output
    }
}

fun main() {
    val firstMatrix = Matrix(
        arrayOf(
            intArrayOf(3, -2, 5),
            intArrayOf(3, 0, 4)
        )
    )

    val secondMatrix = Matrix(
        arrayOf(
            intArrayOf(2, 3),
            intArrayOf(-9, 0),
            intArrayOf(0, 4)
        )
    )

    val secondMatrix1 = Matrix(
        arrayOf(
            intArrayOf(6, 3),
            intArrayOf(9, 0),
            intArrayOf(5, 4)
        )
    )

    println("************* Addition *************")
    println("Matrix 1:")
    println(secondMatrix1)
    println("Matrix 2:")
    println(secondMatrix)
    val addResult = secondMatrix1 + secondMatrix
    println("Addition Result:")
    println(addResult)

    println("************* Subtraction *************")
    println("Matrix 1:")
    println(secondMatrix1)
    println("Matrix 2:")
    println(secondMatrix)
    val subResult = secondMatrix1 - secondMatrix
    println("Subtraction Result:")
    println(subResult)

    println("************* Multiplication *************")
    println("Matrix 1:")
    println(firstMatrix)
    println("Matrix 2:")
    println(secondMatrix)
    val mulResult = firstMatrix * secondMatrix
    println("Multiplication Result:")
    println(mulResult)
}