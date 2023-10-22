class ABC
{
    var x: Int = 0
    companion object{
        var y: Int = 0
    }
}


fun main(){

    val d: String
    d = "..."

    var a = ABC()
    a.x++
    println(a.x)

    var b = ABC()
    b.x++
    println(b.x)

    ABC.y++
    ABC.y++
    println(ABC.y)

    b.x++
    println(b.x)
}