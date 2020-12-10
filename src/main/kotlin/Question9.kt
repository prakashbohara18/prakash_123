fun main()
{
    //Find all the Even nos between two nos. (Take input from user)

    print("Enter start number")
    val s:Int = readLine()!!.toInt()

    print("Enter end number")
    val e:Int = readLine()!!.toInt()

    evenno(s,e)
}

fun evenno(s:Int,e:Int)
{
    print("The even no are:" )

    for(i in s..e )

        if(i%2==0)
        {
            println("$i")
        }

}