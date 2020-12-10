fun main(){
    //Print all the sum of even nos from an array.

    val array3=IntArray(9)
    print("keep on entering numbers for array : ")
    for(i in array3.indices){

        array3[i]= readLine()!!.toInt()
        //println(array1[i])
    }
    addEven(array3)
}

fun addEven(array: IntArray){
    println("Sum of even numbers of the given array is: ")
    var sum= 0
    for(i in array.indices){
        if(array[i]%2==0){

            sum= sum+ array[i]

        }

    }
    print(sum)
}