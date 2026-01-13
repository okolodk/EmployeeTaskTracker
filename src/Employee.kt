class Employee (
    fullName : String,
    position : String,
    salary : Int,
    yearsOfExperience : Int
) : ReportGenerator{
    private val fullName: String = fullName
    private val position : String = position
    var salary : Int = salary
        set(value) {
            if (value < 0) {
                println("Нельзя ставить значение мменьше 0")
                field = 0
            }
        }
    var yearsOfExperience : Int = yearsOfExperience
        set(years) {
            field = years.coerceIn(0,50)
        }
//    fun getfullName() :String = fullName
//    fun getPosition() : String = position
//    fun getSalary() : Int = salary
//    fun getYearsOfExperience() : Int = yearsOfExperience
    override fun generateReport(): String {
        var str : String = "$fullName, $position, $salary, $yearsOfExperience"
        return str
    }
    var currentTask: Task? = null
    var isCompleted : Boolean = true

    fun assignTask(newTask: Task) {
        if (isCompleted) {
            currentTask = newTask
            isCompleted = false
            println("Получил задачу")
        }
        else {
            println("Сотрудник уже занят задачей ${currentTask?.title}")
        }
    }

}
fun main() {
    val employee = Employee("aaa", "bbb", 30000, 30)
//    employee.salary = -10
//    employee.yearsOfExperience = 60
//    println("${employee.salary}")
//    println("${employee.yearsOfExperience}")
    employee.assignTask(Task("A", "aaa", Priority.low))
    employee.assignTask(Task("И", "aaa", Priority.low))

}