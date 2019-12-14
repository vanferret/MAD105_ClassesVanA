class Employee constructor(var employeeName: String? = "Pat Jones",
                           var employeeNumber: Int? = 0,
                           var employeeShift: Int? = 1){
    init {
        //leave it empty for now
    }

    fun getAllPretty(){
        println("Employee Name is: " + employeeName + ". Employee Number is " + employeeNumber.toString() + ". Employee shift is " + employeeShift.toString() + ".")
    }

    fun getName(): String?{
        return employeeName
    }
    fun getNumber(): Int?{
        return employeeNumber
    }
    fun getShift(): Int?{
        return employeeShift
    }
    fun setName(nameIn: String?){
        employeeName = nameIn
    }
    fun setNumber(numberIn: Int?){
        employeeNumber = numberIn
    }
    fun setShift(shiftIn: Int?){
        employeeShift = shiftIn
    }
}
