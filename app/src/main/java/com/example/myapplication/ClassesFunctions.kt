package com.example.myapplication

 open class Aquarium (open var length: Int = 2, open var width: Int = 2, open var height: Int = 2) {
    open var volume : Int
        get() = width * height * length
        set(value){
            height = (value * 100) / (width * length)
        }

    fun printSize(){
        println("Aquarium size is ${width} x ${length} x ${height}")
        println("Aquarium volume is $volume")

    }

}
    class TowerTank(override var length: Int = 2, override var width: Int = 2, override var height: Int = 5) : Aquarium(length, width, height){
        override var volume: Int
            get() = (width * length * height) / 1000
            set(value) {
                height = (value * 1000) / (width * length)
            }
    }

fun main(){
    val aquarium = Aquarium()
    aquarium.printSize()
    aquarium.height = 3
    aquarium.printSize()
    val towerTank = TowerTank()
    towerTank.printSize()
    towerTank.height = 6
    towerTank.printSize()
}
