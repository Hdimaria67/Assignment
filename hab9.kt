fun main() {
    val students = mapOf("Alice" to 80, "Bob" to 65, "Charlie" to 90)
    students.forEach { (name, score) ->
        if (score > 70) println("$name scored $score")
    }
}

