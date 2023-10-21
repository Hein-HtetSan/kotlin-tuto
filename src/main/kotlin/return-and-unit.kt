fun main(): Unit{
    printMax(3, 4)
    println(getMax(5, 66))
}

// this is UNIT function
fun printMax(num1: Int, num2: Int){
    val max: Int = if(num1 > num2) num1 else num2
    println("Max : $max")
}

// this is function that return value
fun getMax(num1: Int, num2: Int): Int{
    return if(num1 > num2) num1 else num2
}