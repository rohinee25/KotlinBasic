package com.example.myapplication

fun main(){


val waterfilter : (Int) -> Int = { dirty -> dirty/2}
    println(updateDirty(30,waterfilter))
    println(updateDirty(15,::increaseDirty))
    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel){dirtyLevel -> dirtyLevel + 23}
    println("Dirty level is $dirtyLevel")

    val sum = calculate(5, 10) { a, b -> a + b }
    println("The sum of 5 and 10 is $sum")
}

fun updateDirty(dirty : Int, operation : (Int) -> Int): Int{
    return operation(dirty)
}

fun increaseDirty(start : Int) = start + 1

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
