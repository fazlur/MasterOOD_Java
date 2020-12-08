package employeeManagement.domain;

public class Employee {
    /* Making the variables private (information hiding)
    this prevents clients of the object from changing it's
     state directly*/
    private long id;
    private String name;
    private String department;
    private boolean working;

    //Creating constructor
    public Employee(long id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    /* Overriding toString method to be able to print
    an instance of this object more readable */

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
