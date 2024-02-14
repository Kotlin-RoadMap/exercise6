//@file:JvmName("KotlinStuff")

package academy.learnprogramming.challenge9

import academy.learnprogramming.javacode.Employee


fun main() {
    val employee = Employee("Jane", "Smith", 2000)
    employee.lastName = "Jones"
    employee.salaryLast3Years = floatArrayOf(50000.25f, 54000.26f, 56800.23f)

}

fun sayHelloToJava(name: String) {
    println("Kotlin says hello to java and $name")
}

object Challenge {
//    @JvmStatic
    fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class Employee(val firstName: String, val lastName: String,  var startYear: Int) {

//class Employee(val firstName: String, val lastName: String, @JvmField var startYear: Int) {

    //    @JvmOverloads fun takesDefault(parm1 : String, parm2: String = "default") {
    fun takesDefault(parm1: String, parm2: String = "default") {

        println("$parm1 and $parm2")
    }

}