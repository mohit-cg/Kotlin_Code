fun main(args: Array<String>) {
    val str = "May the force be with you. "
    println(str)

    val str2 = "May the force \n be with you. "
    println(str2)

    val str3 = "May the force \t be with you. "
    println(str3)

    val str4 = "May the force\b be with you. "
    println(str4)

    val str5 = "May the force\r be with you. "
    println(str5)

    val str6 = "May the \$force be with you. "
    println(str6)

    val str1 = "My dad said the funniest thing he said \"A joke\""  //quatations



    val rawCrawl1 = """ >A long time ago,
        >in a galaxy
        >far, far, far, away....
        >BUMM BUMM BUMMMM""".trimMargin(">")
    println(rawCrawl1)


    val rawCrawl = """ |A long time ago,
        |in a galaxy
        |far, far, away....
        |BUMM BUMM BUMMMM""".trimMargin()
    println(rawCrawl)

    for (char in str){
        println(char)
    }


//    for (char in str){
//        println(char)
//    }


    val contentEquals = str.contentEquals("May the force be with you. ")
    println(contentEquals)

    val contentEquals1 = str.contentEquals("the force be with you. ")
    println(contentEquals1)

    val contains = str.contains("Force", false)
    println(contains)

    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()

    println(uppercase)
    println(lowercase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4, 13)
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old")
    println("Lukes full name $luke has ${luke.length} characters")


}