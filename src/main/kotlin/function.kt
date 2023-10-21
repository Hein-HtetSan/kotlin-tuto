fun main(){
    sayHelloKotlin("Zed", 3)
}

// case sensitive
// declare data type
fun sayHelloKotlin(name: String, reps: Int){
    for(i in 0 until reps){
        println("$reps : Hello, $name")
    }
}