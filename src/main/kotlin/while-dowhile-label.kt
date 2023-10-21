fun main(){

    var i = 0;

    while(i < 5){
        println(i)
        i++
    }

    // outer@ and @outer are labels
    outer@ do{
        println(i)
        i++

        var j = 0

        while(j < 5){
            println("---$j")
            j++
            break@outer
            println("I'm not printed")
        }
        println("I'm printed")
    }while(i < 5)

    for(i:Int in 1..10){
        val prefix:String = if(i !in 4..7) "-" else ">"
        println("$prefix $i")
    }

}