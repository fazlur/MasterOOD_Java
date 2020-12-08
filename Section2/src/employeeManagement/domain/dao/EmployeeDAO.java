package employeeManagement.domain.dao;

import employeeManagement.database.DatabaseConnectionManager;
import employeeManagement.domain.Employee;

public class EmployeeDAO {
    DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();

    public void saveEmployee(Employee employee){
        System.out.println("Saving employee: " + employee);
    }

    public void deleteEmployee(Employee employee){
        System.out.println("Deleting employee: " + employee);
    }


}
