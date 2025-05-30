fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()
    println(if (number % 2 == 0) "Even" else "Odd")
}
