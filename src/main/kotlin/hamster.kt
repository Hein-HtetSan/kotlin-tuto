// creating classes / Hamster.kt

class Hamster{

    fun speak() = "Squeak! "
    fun exerices() =
        this.speak() + // Qualified with 'this'
                speak() + // without this
                "Running on wheel"

}

class Cup{
    var percentFull = 0
    val max = 100
    fun add(x: Int): Int{
        percentFull += x
        if(percentFull > max){
            percentFull = max
        }
        return percentFull
    }
}

class House{
    var sofa: String = ""
}

fun main(){
    val hamster = Hamster()
    println(hamster.exerices())

    val c1 = Cup()
    c1.percentFull = 50
    val c2 = Cup()
    c2.percentFull = 100
    println(c1.percentFull)
    println(c2.percentFull)

    c1.add(20)
    println(c1.percentFull)
    c1.add(50)
    println(c1.percentFull)

    // can't reassign the val to a new House:
    val house = House()
    house.sofa = "Simple sleeper sofa: $89.00"
    println(house.sofa)
    house.sofa = "New leather sofa: $3,099.00"
    println(house.sofa)
}