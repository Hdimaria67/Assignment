fun sum2(a: Int, b: Int) = a + b

fun main() {
    val pairs = listOf(Pair(1, 2), Pair(3, 4))
    for (pair in pairs) {
        println("Sum of ${pair.first} and ${pair.second} is ${sum2(pair.first, pair.second)}")
    }
}
