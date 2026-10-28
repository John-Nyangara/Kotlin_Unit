fun main(){
    //a function is a block of code that performs a specific task
    //for a function to perform a task/run you must call it
    //the main function is where all your  code runs from

    //types of functions
       /*
       1.user defined - this are functions that are build by the programmer to perform a specific task
                         normally its called within the main function
                        fun sum(a: Int, b: Int): String {
                             val result ="sum of $a and $b is ${a + b}"
                             return result
                        }
       2.built-in functions - comes with the coding environment and is specific to different programming languages we have
                              eg pritln() readline() sum()
                              println("rudi kunywa chego")

       3.void fx- is a fx that does not need arguments to be passed

                              terminologies used
       1.parameters - this infers to placeholders for values that are passed to a function
       2.Arguments - this refeers to the actual values that are passed to a function


        */

    //why do we need functions
     /*
        code reusability
        easy debugging
        performance optimization
     */

    /*
        user defined functions
            syntax
             fun namefx(parameters){
                fun body
             }

             function declaration - where you give your function a name and parameters
             function definition - where you give your function the instructions to be executed upon calling
             function call - this is where you pass real values(arguments) to the function with an aim of getting a result

    */

    //write a user defined function that asks a user their name and greets them with their name
    greeting("john")
    greeting(name = "Victor")

    for (nm in 1..40){
        print("$nm .enter your name:")
        val name = readlnOrNull()
        greeting("$name")
    }


}

fun greeting(name:String){
    println("hello $name")
}


