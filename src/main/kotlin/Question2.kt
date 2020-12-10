fun main(args:Array<String>) {
    /*A program takes input from user to find what day is today.
      If today is Saturday, display "It is a happy holiday." else "It is a Weekday".*/

    print("enter which day is today")

    val day: String = readLine()!!.toString()
    whichday(day.toLowerCase())

}
fun whichday(day:String):String{
    if (day=="saturday")
    {
        println("It is happy holiday")
    }
    else if(day=="sunday" || day=="monday"||day=="tuesday"||day=="wednesday"
        ||day=="thursday"||day=="friday")
    {
        println("It is Weekday")
    }
    else
    {
        print("Invalid input")
    }
    return day
}