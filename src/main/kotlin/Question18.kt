fun main()
{
    /* Create a Dictionary app using mapOf() function where
      user will type a word and your program should return the meaning of that word.*/


    println("This is a dictionary app")


    dictionary()

}
fun dictionary(){

    val diction = mapOf(
        "function" to "A function is a combination of instructions that are combined to achieve some result. ",
        "class" to "A class is a blueprint of an object.",
        "object" to "Objects can communicate with well-defined interfaces called messages"


    )
    println("Find meanings of these words: ${diction.keys} ")
    println("What do you want to know about? ")
    val meaningg= readLine()!!

    println("${diction[meaningg]}")

}
