package employeeManagement;

public class EmployeeDAO {
    DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();

    public void saveEmployee(Employee emp){
        System.out.println("Saving employee...");
    }

    public void deleteEmployee(Employee emp){
        System.out.println("Deleting employee...");
    }


}
