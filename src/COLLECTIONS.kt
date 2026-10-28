import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main()=runBlocking{
    val adminRoles = setOf("read", "write", "delete")
    val userRoles = setOf("read", "write")


    launch {
        delay(5000.milliseconds)
        println("this is a coroutine")
    }

// Find what special permissions the admin has that regular users don't
    val extraPermissions = userRoles.subtract(adminRoles)
    println(extraPermissions)
// Result: ["delete"]


}