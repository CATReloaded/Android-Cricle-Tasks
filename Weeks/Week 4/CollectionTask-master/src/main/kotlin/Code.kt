import java.util.Scanner

fun main()
{
    val reader = Scanner(System.`in`)
    val name = listOf("Mahmoud","Mohammed","Suzan","Alaa","Zeinab")
    val game = listOf("Football","Basketball","Volleyball","Karate","Chess")
    val age = listOf(20,25,18,23,27)
    val collage = listOf("Engineering","Science","Medicine","CIS","Pharmacy")

    println(name)
    println(game)
    println(age)
    println(collage)
    val name_inputs = mutableListOf<String>()
    val game_inputs = mutableListOf<String>()
    val age_inputs = mutableListOf<String>()
    val collage_inputs = mutableListOf<String>()



    while (true)
    {

        print("Choose any data: ")
        val input = readLine()!!

        if (input == "Finish")
            break
        else if(input == "Mahmoud" || input == "Mohammed" || input == "Suzan" || input == "Alaa" || input == "Zeinab")
        {
            name_inputs.add(input)
        }
        else if(input == "Football" || input == "Basketball" || input == "Volleyball" || input == "Karate" || input == "Chess")
        {
            game_inputs.add(input)
        }
        else if(input == "20" || input == "25" || input == "18" || input == "23" || input == "27")
        {
            age_inputs.add(input)
        }
        else if(input == "Engineering" || input == "Science" || input == "Medicine" || input == "CIS" || input == "Pharmacy")
        {
            collage_inputs.add(input)
        }

    }

    if (name_inputs.isNotEmpty())
        println(name_inputs)
    if (game_inputs.isNotEmpty())
        println(name_inputs)
    if (age_inputs.isNotEmpty())
        println(name_inputs)
    if (collage_inputs.isNotEmpty())
        println(name_inputs)
    
}



