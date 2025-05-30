class Car(val brand: String, val model: String, val year: Int) {
    init {
        println("Created: $brand $model $year")
    }
}

fun main() {
    Car("Ferarri", "Altima", 2022)
    Car("Mercedes-Benz", "CX-5", 2023)
}
