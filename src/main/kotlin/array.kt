
// created by Zedekiah KH

fun main(){
    println("Array Testing")

    val names: Array<String> = arrayOf("Jim", "John", "Jenny")
    val numbers: Array<Array<Int>> = arrayOf(
        arrayOf(1,3,4),
        arrayOf(3,4,5,7)
    )

    arrayOf(1)
    IntArray(9)

    println(numbers[1][0])
    for(i in 0 until numbers.size){
        for(j in 0 until numbers[i].size){
            print("${numbers[i][j]} ")
        }
        print("\n")
    }

    names[0] = "Jemmy"
    println("First element : ${names[0]}")
    println("Number of elements: ${names.size}")
    println("First element : ${names.first()}")
    println("Last element : ${names.last()}")
}