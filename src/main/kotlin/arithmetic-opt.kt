fun main(){
    var a = 5
    val b = 3

    println("$a + $b = ${a + b}")
    println("$a - $b = ${a - b}")
    println("$a * $b = ${a * b}")
    println("$a / $b = ${a / b}")
    println("$a % $b = ${a % b}")

    // expression
    a += 2
    a -= 3
    a /= 2
    a *= 4

    // increment
    ++a // prefix
    a++ // postfix

    // decrement
    --a // prfix
    a-- // postfix


}