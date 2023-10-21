
fun main(){
    val user = User("zed", 20) // instantitation
    println("User name : ${user.name}")
    println("User age : ${user.age}")

    val user2 = User("zedekiah", 19) // instantition
    println("User name: ${user2.name}")
    println("User age : ${user2.age}")
}

class User(val name: String, val age: Int){
}