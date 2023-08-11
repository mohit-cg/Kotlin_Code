import javax.sound.sampled.Line

fun main(args: Array<String>) {

    fun forceChoke() {
        println("You have failed me for the last time Admiral...")
    }

    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }

    makeAnEntrance("I find your lack of faith distrubing")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
        val goodGuys = rebels+ewoks
        return goodGuys
    }

    val rebels = calculateNumberGoodGuys(5,7)
    //val rebels = 12
    println("Darth Vader faced off against $rebels rebel scum")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(5,7)} rebel scum")

    fun vaderIsFeeling(mood: String ="angry") {
        println(mood)
    }

    vaderIsFeeling()
    vaderIsFeeling("good")

    //excersise 18


    fun Luke(says: String) {
        println(says)
    }
    Luke("Hi I have learned it")


}