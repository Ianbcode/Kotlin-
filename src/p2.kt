/* Ian Becker
   CSE_408_ Problem_2 */
fun main() {
    //initializing 3 individuals' ages
    val person1age = 11; val person2age = 58; val person3age = 95
    //Categorizing age group based from age, return(Family,senior,normal)
    println("person 1 is ${CategorizingByAge(person1age)} ")
    println("person 2 is ${CategorizingByAge(person2age)} ")
    println("person 3 is ${CategorizingByAge(person3age)} ")
    //Checking to see if could ran through
    println("Done")
}
//function comparing age to a specific group category
fun CategorizingByAge(age:Int): String {
    return when (age) {
        in 1..20 -> "Family"
        in 60..100 -> "senior"
        else -> "normal"
    }
}