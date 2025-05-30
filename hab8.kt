open class Person(val name: String, val age: Int) {
    fun printPerson() = println("Name: $name, Age: $age")
}

class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    fun printStudent() = println("Grade: $grade")
}

fun main() {
    val student = Student("Tom", 19, "B")
    student.printPerson()
    student.printStudent()
}
