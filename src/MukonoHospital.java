
abstract class MedicalStaff {
    protected String employeeId;
    protected String department;
    protected int workingHours;

    // Constructor
    public MedicalStaff(String employeeId, String department,
                        int workingHours) {
        this.employeeId = employeeId;
        this.department = department;
        this.workingHours = workingHours;
    }

    // Display common employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Working Hours: " + workingHours);
    }

    // Abstract method for specialized duties
    public abstract void performDuties();
}

class Doctor extends MedicalStaff {
    public Doctor(String id, String department, int hours) {
        super(id, department, hours);
    }

    @Override
    public void performDuties() {
        System.out.println("Duty: Diagnosing patients and prescribing treatment.");
    }
}

class Nurse extends MedicalStaff {
    public Nurse(String id, String department, int hours) {
        super(id, department, hours);
    }

    @Override
    public void performDuties() {
        System.out.println("Duty: Providing patient care and monitoring recovery.");
    }
}

class Pharmacist extends MedicalStaff {
    public Pharmacist(String id, String department, int hours) {
        super(id, department, hours);
    }

    @Override
    public void performDuties() {
        System.out.println("Duty: Dispensing medicines and advising on their use.");
    }
}

class LaboratoryTechnician extends MedicalStaff {
    public LaboratoryTechnician(String id, String department, int hours) {
        super(id, department, hours);
    }

    @Override
    public void performDuties() {
        System.out.println("Duty: Conducting laboratory tests and analyzing samples.");
    }
}

public class MukonoHospital {
    public static void main(String[] args) {

        MedicalStaff doctor =
                new Doctor("D001", "General Medicine", 40);

        MedicalStaff nurse =
                new Nurse("N001", "Nursing", 40);

        MedicalStaff pharmacist =
                new Pharmacist("P001", "Pharmacy", 40);

        MedicalStaff technician =
                new LaboratoryTechnician("L001", "Laboratory", 40);

        MedicalStaff[] staff = {
                doctor, nurse, pharmacist, technician
        };

        for (MedicalStaff member : staff) {
            member.displayInfo();
            member.performDuties();
            System.out.println("-----------------------------");
        }
    }
}
