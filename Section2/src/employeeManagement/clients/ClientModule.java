package employeeManagement.clients;

import employeeManagement.reporting.EmployeeReportFormatter;
import employeeManagement.domain.Employee;
import employeeManagement.domain.dao.EmployeeDAO;
import employeeManagement.reporting.FormatType;

public class ClientModule {

    //Creating main method
    public static void main(String[] args) {
        //Instantiating Employee object
        Employee mike = new Employee(001, "Mike", "Accounting", true);
        ClientModule.hireNewEmployee(mike);
        printEmployeeReport(mike, FormatType.XML);

    }

    //Instantiating EmployeeDAO on hireNewEmployee and terminateEmployee

    public static void hireNewEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);

    }

    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }


}
