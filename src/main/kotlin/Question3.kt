fun main()
{
    //Find whether user inputs positive or negative number or zero.

    print("Please enter the number")

    var num= readLine()!!.toInt()
    testnum(num)

}

fun testnum(num:Int)
{
    if(num>0)
    {
        print("The supplied number is positive")
    }

    else if(num<0)
    {
        print("The supplied number is negative")
    }
    else
        print("The supplied number is zero")


}