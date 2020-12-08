package employeeManagement.reporting;

public class ReportFormatter {

    String formattedOutput;

    //Creating constructor
    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType){
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
        }

    }

    //Changing the return type from void to String
    public String convertObjectToXML(Object object){
        //Returning the object after converting it to String
        return "XML : <title>" + object.toString() + "<title>";
    }

    public String convertObjectToCSV(Object object){
        return "CSV : ,,," + object.toString() + ",,,";
    }
    protected String getFormattedValue(){
        return formattedOutput;
    }
}
