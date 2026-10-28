package quizes.easy

fun main() {
    val item = readln()
    val price = readln().toDouble()
    val quantity = readln().toInt()
    val total = price * quantity

    println("Item: $item")
    println("Price: $%.2f".format(price))
    println("Quantity: $quantity")
    println("Total: $%.2f".format(total))
}
