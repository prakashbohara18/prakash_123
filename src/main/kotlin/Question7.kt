fun main()
{
    //Convert single digit number to Word. (Hint: 7 to Seven)

    print("Please enter single digit number")
    val num:Int= readLine()!!.toInt()
    numconvert(num)

}

fun numconvert(num:Int)
{
when(num) {
    1 -> print("one")
    2 -> print("two")
    3 -> print("three")
    4 -> print("four")
    5 -> print("five")
    6 -> print("six")
    7 -> print("seven")
    8 -> print("eight")
    9 -> print("nine")


    else -> {
            print("Please enter single digit number")
    }
}
}