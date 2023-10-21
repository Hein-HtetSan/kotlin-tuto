
fun main(){
    val user = User("zed", 20) // instantitation
    println("User name : ${user.name}")
    println("User age : ${user.age}")

    val user2 = User("zedekiah", 19) // instantition
    println("User name: ${user2.name}")
    println("User age : ${user2.age}")

    val dog = Dog("Buddy")
    val cat = Cat("Whisters")

    dog.makeSound()
    cat.makeSound()
}

class User(val name: String, val age: Int){
}

open class Animal(val name: String){
    open fun makeSound(){
        println("$name make a generic animal sound")
    }
}

class Dog(name: String) : Animal(name){
    override fun makeSound() {
        println("$name barks like a dog.")
    }
}

class Cat(name: String) : Animal(name){
    override fun makeSound(){
        println("$name meows like a cat")
    }
}