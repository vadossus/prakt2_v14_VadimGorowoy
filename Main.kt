import kotlinx.coroutines.*


suspend fun main() = runBlocking {
    try {
        println("Введите повторы: ")
        var repeat_count = readLine()!!.toInt()
        var info = AboutCar("",0.0,0)
        info.CarMarks()
        if (repeat_count == 0)
        {
            println("Количество повторений не может равнятся нулю")
            System.exit(0)
        }
        else
        {

            repeat(repeat_count){
                var car = AboutCar("",0.0,0)
                launch {
                    car.Input()
                    delay(1000)
                    println(car.Info())
                    delay(1000)
                    car.Probeg()
                }
        }
        }

    }
    catch (ex:Exception)
    {
        println("Возникла ошибка при вводе")
        System.exit(0)
    }
}