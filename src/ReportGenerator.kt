interface ReportGenerator {
    fun generateReport(): String
}


//fun main() {
//    val reportGenerators : List<ReportGenerator> = listOf(
//        Employee("aaa", "bbb", 30000, 30),
//        DevelopmentDepartment("BBB"),
//        Employee("AAA", "BBB", 30000, 30),
//        DevelopmentDepartment("DDD")
//    )
//    for (c in reportGenerators) {
//        println(c.generateReport())
//    }
//}