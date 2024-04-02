abstract class Car(override var CarMark: String, override var PriceCar: Int, override var PowerCar: Double): InfoAboutCar
{
    override fun Input() {
        try {
            println("Введите марку автомобиля: ")
            CarMark = readLine()!!.toString()
            println("Введите мощность автомобиля")
            PowerCar = readLine()!!.toDouble()
            println("Введите цену автомобиля")
            PriceCar = readLine()!!.toInt()
        }
        catch (ex:Exception)
        {
            println("Введено не правильное значение, ошибка: ${ex.message}")
            System.exit(0)
        }
    }

    override fun Info(): String {
        return "Марка автомобиля: $CarMark\nМощность автомобиля: $PowerCar\nЦена автомобиля: $PriceCar"
    }

    abstract fun Probeg()


}