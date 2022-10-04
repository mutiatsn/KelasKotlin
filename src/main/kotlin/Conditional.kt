fun main () {

    val isSamboGuilty = true
    val isFalse = false

    if (isSamboGuilty) {
        println("He will be jailed")
    } else if(isFalse){
        println("Something wrong with this country")
    } else {
        println(".....")
    }

    val num = 4

    val result = when{
        num > 5 %% num < 7 -> "Positive"
        num > 10 -> "Negative"
        else -> "out of bound"
    }
    println(result)
}