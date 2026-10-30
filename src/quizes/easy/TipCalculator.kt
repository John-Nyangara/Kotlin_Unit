package quizes.easy

fun calculateTip(bill: Double, tipPercent: Int) {
    val tipRate = tipPercent / 100.0
    val tipAmount = bill * tipRate
    val finalTotal = bill + tipAmount   // Calculate tip and total

    println("Bill: $%.2f".format(bill))
    println("Tip: $%.2f".format(tipAmount))
    println("Total: $%.2f".format(finalTotal))      // Print formatted results

}
fun main() {
    val billInput = readln().trim().toDouble()
    val tipPercentInput = readln().toInt()

    calculateTip(billInput, tipPercentInput)
}
