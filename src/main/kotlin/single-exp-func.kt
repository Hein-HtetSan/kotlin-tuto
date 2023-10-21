fun main() {
    println(double(12))
}


fun double(num: Int) = num * 2
fun getMaxs(a: Int, b: Int) = if(a > b) a else b
fun getMaxs(a: Double, b: Double) = if(a > b) a else b
fun getMaxs(a: Int, b:Int, c:Int) =
    when{
        a >= b && a >= c -> a
        b >= a && b >= c -> b
        else -> c
    }
