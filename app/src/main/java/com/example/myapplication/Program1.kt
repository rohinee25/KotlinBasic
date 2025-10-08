package com.example.myapplication

data class User(val id: Int, val name: String)
data class Mentor(val id:Int, val name: String)
fun main() {
    val users = listOf(
        User(1, "Alice"),
        User(2, "Bob"),
        User(1, "Alice Dup")
    )

    val mentors = listOf(
        Mentor(1, "Rohinee"),
        Mentor(2, "Ganesh"),
        Mentor(1, "Rohinee Satpute")
    )
    val uniqueById1 = mentors.distinct()
    println(uniqueById1)

    val setTo = mentors.toSet()
    println("setTo$setTo")

    val hashSet = mentors.toHashSet()
    println("hashSet$hashSet")

    val mutableHashSet = mentors.toMutableSet()
    println("mutableHashSet$mutableHashSet")


}
