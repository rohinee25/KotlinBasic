package com.example.myapplication

import java.util.Random


fun main(args :Array<String>){

    feedTheFish()

    swim()
    swim("slow")
    swim(speed ="turtle-like")
    var change = shouldChangeWater("Sunday",55,50)
    println("Should change water $change")
    change = shouldChangeWater(randomDay(),60,50)
    println("Should change water $change")
    change = shouldChangeWater()
    println("Should change water $change")
    change = shouldChangeWater(temperature = 44, dirty = 40, day = "Sunday")
    println("Should change water $change")

    //filter list of string which stats with 'p' letter

    val decorations = listOf("rock","pagoda","plastic plant","alligator","flowerpot")
    println( decorations.filter{ it[0] == 'p'})
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered") // prints object
    val newList = filtered.toList()
    println("new list: $newList") // prints list
    println(" ") // prints list
    val lazyMap = decorations.asSequence().map {
        print("map: $it") //prints object
        it
    }
    println("lazy: $lazyMap") // print object
    println("first: ${lazyMap.first()}") //prints 1st value
    println("list ${lazyMap.toList()}") // prints complete list

    val mySports = listOf("basketball","fishing","running")
    val myPlayers = listOf("LeBron James","Ernest Hemingway","Usain Bolt")
    val myCities = listOf("Los Angeles","Chicago","Jamaica")
    val myList = listOf(mySports,myPlayers,myCities)
    println("$myList")
    val myList2 = listOf(mySports,myPlayers,myCities).flatten()
    println("$myList2")





}

fun shouldChangeWater(day : String = randomDay(), temperature : Int = 22, dirty :Int =20): Boolean{
    return when{
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}


fun isTooHot(temperature : Int ): Boolean = temperature > 30

fun isDirty(dirty : Int) : Boolean = dirty>50

fun isSunday(day :String): Boolean = day == "Sunday"
fun swim(speed :String ="fast"): String{

    return "swimming $speed"
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun fishFood(day : String): String{

    return  when(day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
    }

}

fun randomDay() : String{

    val week = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(week.size)]
}