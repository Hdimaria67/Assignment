fun applyOperation2(a: Int, b: Int, op: (Int, Int) -> Int) = op(a, b)

fun main() {
    val result = applyOperation2(7, 2) { x, y -> x * y }
    println(result)
}

