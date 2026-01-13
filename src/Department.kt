abstract class Department {
    abstract val departmentName : String

    abstract  fun printDepartmentGoal()
}
class DevelopmentDepartment(override val departmentName: String = "Разработка") : Department(),ReportGenerator {
    override fun printDepartmentGoal() {
        println("Писать чистый код")
    }
    override fun generateReport(): String {
        return "Название депортаминта - $departmentName"
    }
}
class  TestingDepartment(override val departmentName: String = "Тестирование") : Department() {
    override fun printDepartmentGoal() {
        println("Находить все баги")
    }
}
fun main() {
    val devel = DevelopmentDepartment()
    val test = TestingDepartment()

    devel.printDepartmentGoal()
    test.printDepartmentGoal()
}