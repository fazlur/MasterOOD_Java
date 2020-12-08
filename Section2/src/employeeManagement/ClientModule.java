package employeeManagement;

public class ClientModule {
    EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter();
    Employee employee = new Employee();
    EmployeeDAO employeeDAO = new EmployeeDAO();

    public void hireNewEmployee(Employee emp){
        System.out.println("New hire...");
    }

    public void terminateEmployee(Employee emp){
        System.out.println("Fired employee...");
    }

    public void printEmployeeReport(Employee emp){
        System.out.println("Printing employee report...");
    }


}
