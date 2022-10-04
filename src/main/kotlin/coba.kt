fun main (args : Array<String>) {

    var hour: Int

    hour = 8

    var total = when {
        hour >= 24 -> (15 * (hour/24)) + (0.5 * (hour%24))
        hour > 5 && hour <24 -> 5 + ((hour-5)*0.5)
        else -> hour.toDouble()
    }
    println(total)
}