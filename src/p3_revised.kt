/* Ian Becker
   CSE_408_ Problem_3 */
fun main(){
    //original point amount for player
    var cardPoints = 7_000
    //dictating player's bracket level from point amount
    val cardlevel = when (cardPoints) {
        in 0..999 -> "pearl"
        in 1_000..4_999 -> "silver"
        in 5_000..9_999 -> "gold"
        else -> "platinum"
    }
    //verifying if player has more than 1 point amount
    val plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    //printing results for player's point amount and bracket level
    println("You have $cardPoints point$plural and are at the $cardlevel level.")
    //Checking to see if could ran through
    println("Done")
}