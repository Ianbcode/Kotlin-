/* Ian Becker
   CSE_408_ Problem_5 part 2*/

fun main() {
    mathTeacher().talk(); mathTeacher().walk(); mathTeacher().eat(); mathTeacher().teachMath()
    println()
    footballer().talk(); footballer().walk(); footballer().eat(); footballer().playFootball()
    println()
    businessman().talk(); businessman().walk(); businessman().eat(); businessman().runBusiness()
}

open class Person() {
    var firstname = "Karen"
    var age = 25
    fun talk(){
        println("Hello my name is $firstname")
    }
    fun walk(){
        println("My age is $age.")
    }
    fun eat(){
        println("My favorite food is pasta.")
    }
}
class mathTeacher(): Person() {
    fun teachMath(){
        println("I teach Computer Science at CSUSB.")
    }
}
class footballer(): Person() {
    fun playFootball(){
        println("I play for the LV Raiders.")
    }
}
class businessman() : Person() {
    fun runBusiness(){
        println("I work as consultant for Apple.")
    }
}