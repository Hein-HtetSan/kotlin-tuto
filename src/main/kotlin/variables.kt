fun main(){

    // type inference
    var userName: String = "Zedekiah" // mutuable
    userName = "Zedekiah KH"
    val age: Int = 19 // immutable

    // normal
    val name = "KH"
    val year = 2023

    println("Hello world" + userName) // string concat
    println("Hello, $userName") // string template

    sayHello("Zedekiah")
}

fun sayHello(name: String){
    println("Hello My name is $name")
}
