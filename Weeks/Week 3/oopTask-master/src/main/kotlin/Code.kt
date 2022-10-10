import java.util.*

fun main(){

    val reader = Scanner(System.`in`)
    print("Choose number from 1 ... 4 :")
    var num:Int = reader.nextInt()

    when(num){
        1 ->
        {
            val game=Football()
            game.display()
        }
        2 ->
        {
            val game=Basketball()
            game.display()
        }
        3 ->
        {
            val game=Karate()
            game.display()
        }
        4 ->
        {
            val game=Chess()
            game.display()
        }


    }


}

open class Game(val name:String, val players_num:Int, val ball:String, val games_status:String)
{}

class Football(name: String="Football",players_num: Int=11,ball: String="have ball",games_status: String="collective"):Game(name,players_num,ball,games_status)
{

    fun display(){
        println("$name, $players_num Player , $ball , $games_status")
    }

}

class Basketball(name: String="Basketball",players_num: Int=5,ball: String="have ball",games_status: String="collective"):Game(name,players_num,ball,games_status)
{

    fun display(){
        println("$name, $players_num Player , $ball , $games_status")
    }

}

class Karate(name: String="Karate",players_num: Int=1,ball: String="not have ball",games_status: String="individually"):Game(name,players_num,ball,games_status)
{

    fun display(){
        println("$name, $players_num Player , $ball , $games_status")
    }

}

class Chess(name: String="Chess",players_num: Int=1,ball: String="not have ball",games_status: String="individually"):Game(name,players_num,ball,games_status)
{

    fun display(){
        println("$name, $players_num Player , $ball , $games_status")
    }

}


