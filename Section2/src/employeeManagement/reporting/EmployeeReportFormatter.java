package employeeManagement.reporting;

import employeeManagement.domain.Employee;

//As this class is a child of ReportFormatter...extending it
public class EmployeeReportFormatter extends ReportFormatter{

    /*Generating constructor based on ReportFormatter class but changing
    the Object object from the constructor to Employee object*/
    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee(){
        return getFormattedValue();
    }
}
