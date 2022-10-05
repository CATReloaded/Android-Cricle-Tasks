import java.util.Scanner


fun main()
{
    print("Enter your mood: ")
    val mood = readLine()!!
    print("Enter the state of weather: ")
    val weather = readLine()!!

    val hello1 = plus(4,5)
    val hello2 = {plus(4,5)}
    println(hello1)
    println(hello2)


    if (mood == "" && weather == "")
        personMood {
            temp(weather = "Mild")
        }
    else
        personMood(mood,weather){
            temp(weather)
        }

}

fun personMood (mood : String = "Happy" , weather : String = "Mild",function:()->Unit){

    if (mood == "Happy" && weather == "Sunny")
        println("Go to swimming")

    if (mood == "Happy" && weather == "Rainy")
        println("Stay and watch your favorite film")

    if (mood == "Happy" && weather == "Mild")
        println("Go to gym")

    if (mood == "Sad" && weather == "Sunny")
        println("Go to club")

    if (mood == "Sad" && weather == "Rainy")
        println("Play games on computer")

    if (mood == "Sad" && weather == "Mild")
        println("Call your friend and enjoy")

    function()

}

fun temp(weather: String = "Mild")
{
    when(weather){
        "Sunny"-> println("temperature from 35 to 50")
        "Rainy"-> println("temperature from 10 to 20")
        "Mild"-> println("temperature from 20 to 35")
    }
}

fun plus(x:Int,y:Int):Int
{
    val result = x + y
    return result
}

/*
first one return the result after take parameters it takes type of function and return it
second one return the function type
*/

