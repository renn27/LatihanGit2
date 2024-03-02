import kotlin.math.PI

class Circle(private val radius: Double) {
    fun calculateArea(): Double {
        return PI * radius * radius
    }

    fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Triangle() {
    fun calculate() {
        val height = 5.0
        val width = 5.0

        val triangleArea = (width * height) / 2
        println("Triangle Area is : $triangleArea")
    }
}

fun main() {
    val radius = 5.0
    val circle = Circle(radius)
    Triangle().calculate()
    println("Area of the circle: ${circle.calculateArea()}")
    println("Perimeter of the circle: ${circle.calculatePerimeter()}")
}