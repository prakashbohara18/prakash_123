fun main()
{
    //Find all the Odd nos between two nos. (Take input from user)

    print("Please enter start number")
    val s:Int= readLine()!!.toInt()

    print("Please enter end number")
    val e:Int= readLine()!!.toInt()
    oddno(s,e)

}

fun oddno(s:Int,e:Int)
{
    print("Even no are:")
    for(i in s..e)
    {
        if(i%2==0)
        {

        }
        else
        {
            println("$i")
        }
    }

}