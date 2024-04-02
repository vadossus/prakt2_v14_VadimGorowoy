class AboutCar(CarMark: String, PriceCar: Double, PowerCar: Int): Car(CarMark,PowerCar,PriceCar)
{
    override fun Probeg() {
        try {
            println("Введите емкость бака вашего автомобиля")
            var capacity = readLine()!!.toDouble()
            println("Введите расход топлива на 100 км")
            var rasxod_benzin = readLine()!!.toDouble()
            if (capacity == 0.0 || rasxod_benzin == 0.0)
            {
                println("Емкость бака или расход бензина не может равнятся нулю")
                System.exit(0)
            }
            else
            {
                var probeg = (capacity * 100)/ rasxod_benzin
                println("Пробег вашего автомобиля: ${String.format("%.1f",probeg)}")
            }

        }
        catch (ex:Exception)
        {
            println("Произошла ошибка: ${ex.message}")
        }
    }

    fun CarMarks()
    {
        println("")
        println("BMW - 460 л.с/19.1 литров на 100 км")
        println("Mercedes-Benz - 210 л.с/10.5 литров на 100 км")
        println("LADA - 103 л.с/7 литров на 100 км")
        println("Renault - 180 л.с/9 литров на 100 км")
        println("")
    }
}