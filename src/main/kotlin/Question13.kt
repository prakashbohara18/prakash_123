fun main(){
    //Write a program display the pattern like right angle triangle using an asterisk.
    print("Enter a number")
    val num = readLine()!!.toInt()
    asterisk(num)
}
fun asterisk(rows:Int){
    for (i in 1..rows){
        for (j in 1.. i){
            print("* ")
        }
        println()
    }
}
