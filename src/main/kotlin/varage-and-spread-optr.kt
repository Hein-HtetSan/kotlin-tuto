fun main(){

    val names = arrayOf("Zed", "KH", "Peek")
    greetAll(*names)

    println("Total : ${sumAll(1,5,8,8,7,9)}")

}
// vararg function
fun sumAll(vararg numbers: Int): Int{
    var result: Int  = 0
    for(number in numbers){
        result += number
    }
    return result
}


// spread operators
fun greetAll(vararg name: String){
    for(x in name){
        println("Hello, $x")
    }
}