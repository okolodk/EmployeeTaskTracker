enum class Priority {
    low,
    medium,
    high
}
data class Task(
    val title : String,
    val description: String,
    val priority : Priority,
    var isCompleted : Boolean = false
)
fun main() {
    val task1 = Task("A", "aaa", Priority.low)
    val task2 = Task("A", "aaa", Priority.medium)
    val task3 = Task("A", "aaa", Priority.high)

    val task4 = task1.copy(title = "B")
    val task5 = task1.copy(title = "B")
    println(task4.toString())
    println("${task2.hashCode()}")
    println("${task4.hashCode()}")
    println("${task5.hashCode()}")

    println(task4.equals(task5))
}