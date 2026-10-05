//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val name = "John"
    val text = """
Hello,
Kotlin
"""

    val quote = """Kotlin says, "Hi"."""
    //long
    //short
    //int currentage = 24

    //float - accepts numbers with a fractional part (6dp) ,F val number:Float = 5.75F
    //double = accepts numbers with a fractional part (15dp) by default


    //strings = "john" -combination of characters
    //booleans =true/false




            //    Use Int for whole numbers.(-+2B )
            //    Use Long for whole numbers outside the Int range.()
            //    Use Double for decimal numbers.
            //    Use Float when lower precision is acceptable or required

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello $name")
    println("hello " + name +" welcome to kotlin")
    println("$text")

    var num1 = "i"
    var num2 = "v"


    println("The sum is ${num1+num2}")


//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }

}