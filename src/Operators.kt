// types of operators

    /*1.Arithmetic operators
        addition +
        subraction -
        division  /
        Multiplication *
        modulus - %
        increment - ++
        decrement - --

       2.comparison operators
         > - greater than
         < - less than
         >= - greater than or equal to
         <= - less than or equal to
         == - equals to
         != - not equal to

       3.assignment operators
          = assignment
         -= subtraction assignment
         += addition assignment
         *= multiplication assignment
         /=division assignment
         %=modulus assignment

       4.logical operators
         and - &&
         or - ||
         not - !
        */

fun main(){
    var num = 1
    var addition = 3+17
    println("addition:${addition}")
    println("subtraction:${17-3}")
    println("Division:${17/3.toDouble()}")
    println("Multiplication:${3*17}")
    println("modulus:${17%3}")
    println("Increment:${++num}")
    println("Decrement:${--num}")

    var age=10
    println("Age age:${age}")
    age=30
    println("Age age:${age}")

    //assignment operators
    var num1 = 200

    num1+=1
    println("addition assignment:${num1}") //similar to num1=num1+1
    num1-=1
    println("subtraction assignment:${num1}")//similar to num1=num1-1
    num1/=2
    println("Division assignment:${num1.toDouble()}")//similar num1=num1/2
    num1*=2
    println("Multiplication assignment:${num1}")
    num1%=2
    println("modulus assignment:${num1}")


    //comparison operators - result of this operation provide two state (true or fasle)
    println("greater than:${3>17}")
    println("Less than:${3<17}")
    println("Greater than or equal to:${3>=17}")
    println("Less than or equal to:${3<=17}")
    println("Equal to:${17==3}")
    println("Not Equal to:${17!=3}")

    //logical operators
//    println("Not Equal to:${17!=3}")
    println("and operator:${5<=15 && 15>=20}")//false
    println("or:${!(5<=15 || 15>=20)}")//true


        val isUserLoggedIn = true  // This would normally come from your authentication system
        // Using the NOT operator to check if the user is NOT logged in
        if (!isUserLoggedIn) {
            println("Please log in to continue.")
        } else {
            println("Welcome back!")
        }
    }




