fun main()
{
    //Find all the Sum of even nos between two nos. (Take input from user)

    print("Please enter start number")
    val s:Int= readLine()!!.toInt()

    print("Please enter end number")
    val e:Int= readLine()!!.toInt()
    sumeven(s,e)
}

fun sumeven(s:Int,e:Int)
{
    println("The even no are :" )
    var sum=0
    for(i in s..e )

        if(i%2==0)
        {
            print("$i,")
            sum=sum+i
        }

    println("The sum of even number between $s and $e is:$sum")

}