fun main(){
    //Print the greatest and lowest number from an array.

    val array4=IntArray(9)
    print("keep on entering numbers for array: ")
    for(i in array4.indices){

        array4[i]= readLine()!!.toInt()
        //println(array1[i])
    }
    maxcomparearray(array4)
    mincomparearray(array4)
}

fun maxcomparearray(array: IntArray){
    print("Maximum number from the given array is: ")


    var Max=array[0]

    for (i in array.indices){
        if (array[i]>Max)
            Max=array[i]
    }
    print("$Max and ")

}
fun mincomparearray(array: IntArray){
    print("Minimum number from the given array is: ")


    var Min=array[0]

    for (i in array.indices){
        if (array[i]<Min)
            Min=array[i]
    }
    print(Min)

}


