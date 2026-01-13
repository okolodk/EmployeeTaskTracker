interface ReportGenerator {
    fun generateReport(): String
}
class Employee(val name : String, val position : String) : ReportGenerator {
    override fun generateReport(): String {
        var str : String = "$name, $position и т.д."
        return  str
    }
}

fun main() {
    val reportGenerators : List<ReportGenerator> = listOf(
        Employee("AAA", "aaa"),
        DevelopmentDepartment("BBB"),
        Employee("CCC", "ccc"),
        DevelopmentDepartment("DDD")
    )
    for (c in reportGenerators) {
        println(c.generateReport())
    }
}