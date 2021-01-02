package employeeManagement.domain;

public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector = new HospitalManagement();

        Employee peggy = new Nurse(100, "Peggy", "Emergency", true);
        ERDirector.callUpon(peggy);

        Employee susan = new Doctor(200, "Susan", "Emergency", true);
        ERDirector.callUpon(susan);
    }
}
