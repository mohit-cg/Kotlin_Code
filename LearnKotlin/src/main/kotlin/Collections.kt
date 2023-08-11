fun main(args: Array<String>) {

    //mutable

    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Seira")
    println(imperials)
    println(imperials[3])
    println(imperials.sorted())
    println(imperials.last())
    println(imperials.contains("Mohit"))
    println(imperials)


    //immutable

    val rebels = arrayListOf("Seira", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Mohit")
    println(rebels)
    rebels.add(0,"lover")
    println(rebels)
    println(rebels.indexOf("Seira"))

    rebels.remove("Han Solo")
    println(rebels)

    val rebelVehiclesMap = mapOf("Solo" to "Millenium", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship does not exist"))
    println(rebelVehiclesMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    rebelVehicles.clear()
    println(rebelVehicles)
    rebelVehicles.isEmpty()


}