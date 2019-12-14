fun main() {

    // Ideally, I would have a container class for my employees, but for now I will create all the separate
    // objects here
    val employee1 = Employee("Van Anderson",50977,1)
    val employee2 = Employee("Aaron Kinney",29111,2)
    val employee3 = Employee("Meghan Cunningham",9853,3)

    employee1.getAllPretty()
    employee2.getAllPretty()
    employee3.getAllPretty()

    // Use some of the other methods
    employee1.setName("Van S Anderson")
    employee1.getAllPretty()

    println(employee3.getName())
}