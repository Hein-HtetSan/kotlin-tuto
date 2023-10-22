fun main(){
    val user1 = User3("   Hans    ", 30)

    val user2 = User3("  Elfriede   ", 60)

    val user3 = User3(age = 60)

    val user4 = User3("     ", 20)
}

class User3(name: String = "No Name", var age: Int){
    val name: String
    init{
        if(name.isBlank()){
            this.name = "No Name"
        }else{
            this.name = name.trim()
        }
        println("New User created Name: ${this.name}, Age: $age")
    }
}
