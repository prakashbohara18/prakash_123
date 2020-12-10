fun main()
{
  /* WAP to take monthly salary. If yearly salary is above 200,000 then display
    “You have to pay tax” otherwise display “You don’t have to pay tax.”*/

    print("Please enter your Salary")
    val msalary:Float= readLine()!!.toFloat()
    val ysalary=msalary*12

    tax(ysalary)
}

fun tax(ysalary:Float)
{

    if(ysalary>200000)
    {
        print("You have to pay tax")
    }
    else
    {
        print("You dont need to pay tax")
    }
}