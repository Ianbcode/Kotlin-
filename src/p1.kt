/* Ian Becker
   CSE_408_ Problem_1 */
fun main(args: Array<String>) {
    //initializing 1st and 2nd numbers
    var firstNumber = 125; val secondNumber = 125
    //comparing 1st and 2nd numbers, returns (1,0,-1)
    println("After comparing number x and number y we get = ${CompareingTwoNumbers(firstNumber, secondNumber)}")
    //Checking to see if could ran through
    println("Done")
}
//function comparing 2 numbers to check which number is greater
fun CompareingTwoNumbers(x: Int, y: Int): Any {
    val max = if(x < y) {
        -1
    } else if(x > y) {
        1
    } else {
        0   //case if values are equal to one another
    }
    return max
}