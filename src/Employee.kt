//class Employee (
//
//) {
//    private val fullName: String = "Алексеев Григорий Сергеевич"
//    private val position : String = "Студент"
//    var salary : Int = 60
//        set(value) {
//            if (value < 0) {
//                println("Нельзя ставить значение мменьше 0")
//                field = 0
//            }
//        }
//    var yearsOfExperience : Int = 30
//        set(years) {
//            field = years.coerceIn(0,50)
//        }
//    fun getfullName() :String = fullName
//    fun getPosition() : String = position
//    fun getSalary() : Int = salary
//    fun getYearsOfExperience() : Int = yearsOfExperience


//}
//fun main() {
//    val employee = Employee()
//    employee.salary = -10
//    employee.yearsOfExperience = 60
//    println("${employee.salary}")
//    println("${employee.yearsOfExperience}")
//}