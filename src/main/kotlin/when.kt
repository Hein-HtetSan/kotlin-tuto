fun main(){

    val time: Int = 12

    val greeting: String = when{
        time < 12 -> "Good morning"
        time > 12 -> "Good evening"
        time == 12 -> "Good afternoon"
        else -> "Good day"
    }

    val greet = when(time){
        in 0..5 -> println("Why up so early?")
        in 0..11 -> println("Good Morning?")
        12 -> println("Time for lunch?")
        13, 14 -> {
            println("Yawn...")
            "Time for a nap!"
        }
        else -> println("Good day!")
    }

    println("Time $time : $greeting")
    println("Greet : $greet")
}