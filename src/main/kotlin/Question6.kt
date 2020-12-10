fun main()
{
    //Display "Sunday" for 1, "Monday" for 2... "Saturday" for 7.

    print("which day is today")

    val day:String= readLine()!!.toString()

    Findday(day.toLowerCase())
    print(" for $day")

}

fun Findday(day:String):String
{
    when(day)
    {
        "sunday"->print("1")
        "monday"-> print("2")
        "tuesday"-> print("3")
        "wednesday"-> print("4")
        "thursday"-> print("5")
        "friday"-> print("6")
        "saturday"-> print("7")
    }
    return day
}