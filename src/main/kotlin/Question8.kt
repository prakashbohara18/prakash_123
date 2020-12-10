fun main()
{
    /*WAP to take monthly salary. Calculate the tax amount if yearly salary is.
        1 to 200,000 tax is 1%
        200,000 to 350,000 tax is 1% of first 200,000+15% of remaining salary
        350,000 to above tax is 1% of first 200,000 + 15% of next 150,000 + 25% of remaining salary*/

    print("Please enter your monthly salary")

    val monthlysalary:Float= readLine()!!.toFloat()
    val yearlysalary= monthlysalary*12

    yearlytax(yearlysalary)
}

fun yearlytax(yearlysalary:Float)
{

    if(yearlysalary>1 && yearlysalary<200000)
    {
        //
        print("Tax is very few")
    }
    else if(yearlysalary>200000 && yearlysalary<350000)
    {
        print("tax is medium")
    }

    else
    {
        print("tax is high")
    }
}