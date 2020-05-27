/* Ian Becker
   CSE_408_ Problem_5 part 1*/

fun main() {
    MathTeacher().talk(); MathTeacher().walk(); MathTeacher().teachMath()
    println()
    Footballer().talk(); Footballer().walk(); Footballer().playFootball()
    println()
    Businessman().talk(); Businessman().walk(); Businessman().runBusiness()
}
class MathTeacher(){
    var firstname = "Karen"
    var age = 25
    fun talk(){
        println("Hello my name is $firstname")
    }
    fun walk(){
        println("My age is $age.")
    }
    fun teachMath(){
        println("I teach Computer Science at CSUSB.")
    }
}
class Footballer(){
    var firstname = "Payton"
    var age = 31
    fun talk(){
        println("Hello my name is $firstname")
    }
    fun walk(){
        println("My age is $age.")
    }
    fun playFootball(){
        println("I play for the LV Raiders.")
    }
}
class Businessman(){
    var firstname = "Phillip"
    var age = 18
    fun talk(){
        println("Hello my name is $firstname")
    }
    fun walk(){
        println("My age is $age.")
    }
    fun runBusiness(){
        println("I work as consultant for Apple.")
    }
}