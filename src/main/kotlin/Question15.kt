fun main(){
//Print all the odd nos from an array.

    val array2=IntArray(9)
    print("keep on entering the numbers for : ")
    for(i in array2.indices){

        array2[i]= readLine()!!.toInt()
        //println(array1[i])
    }
    oddnoinarray(array2)
}

fun oddnoinarray(array: IntArray){
    println("Odd numbers in array are ")
    for(i in array.indices){
        if(array[i]%2!=0){
            println(array[i])
        }
    }
}