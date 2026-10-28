/*

    oop- object oriented programming (this gives you freedom to inherit properties and methods so as
    to reduce redundancy)
    class - blueprint of an object
    object- instance of a class

    properties- variables inside your class
    methods - functions inside your class
    instansiation- creating objects from a class
    constructors -is a special function used to initialize a class's properties

    syntax
    declaring and defining a class
    class identifier/name{
        properties
        methods
    }

    instansiation
    val object = class()
    eg val c1 = car()

    inheritance -this is where a child class borrows some of the properties and methods from the parent class
    subclass (child) - the class that inherits from another class
    superclass (parent) - the class being inherited from
    
 */


class Car {
    //this class does not use constructors
    var brand = ""
    var model = ""
    var year = 0

    fun drive(){
        println("Vrooooom")
    }

    fun speed(carspeed :Int){
        println("vehicle speed: $carspeed")
    }
}

//constructors- is a special function used to initialize a class's properties
//the class below uses a constructor making the code less bloty
class animal(var name: String, var age: Int)

//fun classes(){
//    val a1 = animal("shivana",10)
//    println("name is ${a1.name} \nage is ${a1.age}")
//}

fun main() {
    val c1 = Car()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    val c2 = Car()
    c2.brand = "volvo"
    c2.model = "tiguan"
    c2.year = 2007

    println(c1.brand)
    println(c1.model)
    println(c1.year)
    println("")
    println(c1.drive())
    println(c1.speed(20))

    println(c2.brand)
    println(c2.model)
    println(c2.year)
    println(c2.drive())
    println(c2.speed(100))

    val a1 = animal("ai", 28)
    println("name is ${a1.name} \nage is ${a1.age}")

}