fun main(args: Array<String>) {

    val a = 2
    val b = 2

    if (a==b) {
        println("A does in fact equal B")
    }

    val x = 2
    val y = 3

    if (x!=y) {
        println("X does not equal Y")
    }

    val accountbalance = 100
    val price = 50

    if (accountbalance >= price) {
        println("You can buy this!")
    } else {
        println("Sorry, you broke")
    }

    val accountbalance1 = 100
    val price1 = 150

    if (accountbalance1 >= price1) {
        println("You can buy this!")
    } else {
        println("Sorry, you broke")
    }

    val degrees =20

    // ==  !=   >   <   >=   <=

    if (degrees >= 70) {
        println("This is some nice weather")
    } else if (degrees < 70 && degrees >= 50) {
        println("Grab a Sweater")
    } else {
        println("Holy crap its cold!")
    }

    val isHungry = false
    val isBored = true

    if (isHungry == true || isBored == true) {
        println("Lets get pizza")
    }

    val m = 3

    when (m) {
        1 -> println("m == 1")
        2 -> println("m == 2")
        else -> println("m does not equal to 1 or 2")
    }

    fun vaderisfeeling(mood: String = "angry") {
        if (mood == "angry") {
            println("run for the hills, Vader is $mood")
        } else {
            println("whatever you do not make him angry")
        }
    }

    vaderisfeeling("good")

}