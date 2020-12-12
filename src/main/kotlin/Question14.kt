fun main()
{
    //Print all the even nos from an array

    val array1=IntArray( 9)

    print("keep entering number: ")

    for (i in array1.indices)
    {
        array1[i]= readLine()!!.toInt()
    }

    evenoarray(array1)
}

fun evenoarray(array:IntArray)
{
    println("Even no in array are: ")

    for(i in array.indices)
    {
        if(array[i]%2==0)
        {
            println(array[i])
        }
    }
}