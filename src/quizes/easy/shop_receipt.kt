package quizes.easy

fun main() {
    println("---  Input Purchase ---")
    print("Enter Item name: ")
    val item = readln()
    print("Enter Price: : ")
    val price = readln().toDouble()
    print("Enter Quantity: ")
    val quantity = readln().toInt()
    val total = price * quantity

    println("\n--- Receipt ---")
    println("Item: $item")
    println("Price: $%.2f".format(price))
    println("Quantity: $quantity")
    println("Total: $%.2f".format(total))
    println("hello")

    // TipCalc
    println("\n--- Calculate Your Tip ---")
    print("Enter Amount Billed:")
    val bill = readln().trim().toDouble()
    print("Enter Tip : ")
    val tipPercent = readln().toInt()
    print("---Your Tip is---")
    calculateTip(bill, tipPercent)
}

    fun calculateTip(bill: Double, tipPercent: Int) {
        val tipRate = tipPercent / 100.0
        val tipAmount = bill * tipRate
        val total2 = bill + tipAmount  // Calculate tip and total

        println("Bill: $%.2f".format(bill))
        println("Tip: $%.2f".format(tipAmount))
        println("Total: $%.2f".format(total2))  // Print formatted results



    }