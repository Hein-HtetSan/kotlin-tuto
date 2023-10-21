fun main(){
    greet("Zed")
    greet(
        message = "How are you",
        name = "Zed",
        reps = 3
    )
}

// default parameter
fun greet(name: String, reps: Int = 1){
    for(i in 0 until reps) println("Hello, $name!")
}

// default parameter
fun greet(message: String, name: String = "User", reps: Int = 1){
    for(i in 0 until reps) println("Hello, $name! $message")
}

// named parameter
fun greet(reps: Int, message: String){
    for(i in 0 until reps) println(message)
}