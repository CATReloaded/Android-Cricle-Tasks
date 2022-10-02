import java.util.Scanner

fun main(args: Array<String>){

    //first program

    val reader = Scanner(System.`in`)
    var result:Int

    print("Enter start range: ")
    var integer:Int = reader.nextInt()
    print("Enter start range: ")
    var integer2:Int = reader.nextInt()

    if (integer % 7 == 0)
    {
        result = (integer2 / 7) - (integer / 7) + 1
    }
    else
    {
        result = (integer2 / 7) - (integer / 7)
    }

    println("numbers divided by 7 from the scoop are: $result")


    //second project

    var flag = true

    while (flag)
    {
        print("Enter number: ")

        var number:Int = reader.nextInt()

        if (number % 3 != 0 )

            println("$number")

        else if (number % 3 == 0 && number % 5 == 0)

            flag = false

    }

}