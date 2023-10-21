fun main(){

    val names: Array<String> = arrayOf("Jim", "John", "Jenny", "Jamie")

    for(name:String in names) println(name)

    for(i:Int in 1..10) println(i)

    for(i:Int in 10 downTo 1) println(i)

    for(i:Int in 1..10 step 2) println(i)

    for(i:Int in 1.rangeTo(10).step(2)) println(i)

    for(i:Long in 10L downTo 1) println(i)

    for(i:Char in 'a'..'z' step 2) println(i)

//    names.indices
    // Index: ___Element:___
    for(index:Int in names.indices){
        println("Index: $index Elemet: ${names[index]}")
    }


}