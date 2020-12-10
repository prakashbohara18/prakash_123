fun main()
{
    //WAP to find child, young, old or invalid input.

    print("Please enter your age")

    val age= readLine()!!.toInt()
    Findage(age)
   print("and your age is : $age")

}

fun Findage(age:Int):String
{
    val c:String= "You are child"
    val y:String="You are young "
    val o:String="You are old"
    val i:String="You have suplied invalid age"

    if(age>=0 && age<=18)
    {
        print(c)
    }
    else if(age>18 && age<=60)
    {
        print(y)
    }

    else if(age>60 && age<=150)
    {
      print(o)
    }

    else
    {
        print(i)
    }
    return c;y;o;i
}