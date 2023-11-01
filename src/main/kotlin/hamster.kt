// creating classes / Hamster.kt

class Hamster{

    fun speak() = "Squeak! "
    fun exerices() =
        this.speak() + // Qualified with 'this'
                speak() + // without this
                "Running on wheel"

}

fun main(){
    val hamster = Hamster()
    println(hamster.exerices())
}