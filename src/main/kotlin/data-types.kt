fun main(){
    val exString = "\"Zedekiah\nKH\""
    val exRawString = """
        Zedekiah KH
    """
    println(exRawString)

    val exNumber = 2_000_000.12
    val exNumberLong: Long = exNumber.toLong()

    val exChar = '?'
    val exCharInt: Int = exChar.toInt()

    val exBool = false

    val exDouble: Double // declaration
    exDouble = 2_000_000.12 // initialization

}
