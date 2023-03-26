import java.util.Scanner;

class HospitalEmployee {
    protected String name;
    protected int number;

    public HospitalEmployee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return name + " " + number;
    }

    public void work() {
        System.out.println(name + " works for the hospital.");
    }
}

class Doctor extends HospitalEmployee {
    private String specialty;

    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return super.toString() + " " + specialty;
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " works for the hospital. " + super.getName() + " is a(n) " + specialty + " doctor.");
    }
}

class Nurse extends HospitalEmployee {
    private int numOfPatients;

    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }

    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }

    @Override
    public String toString() {
        return super.toString() + " has " + numOfPatients + " patients.";
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " works for the hospital. " + super.getName() + " is a nurse with " + numOfPatients + " patients.");
    }
}

class Surgeon extends Doctor {
    private boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    @Override
    public String toString() {
        return super.toString() + " Operating: " + operating;
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " works for the hospital. " + super.getName() + " is " + (operating ? "operating now." : "not operating."));
    }
}
public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get inputs for Nurse
        System.out.println("Enter name for Nurse:");
        String nurseName = scanner.nextLine();
        System.out.println("Enter number for Nurse:");
        int nurseNumber = scanner.nextInt();
        System.out.println("Enter number of patients for Nurse:");
        int nurseNumOfPatients = scanner.nextInt();
        Nurse vito = new Nurse(nurseName, nurseNumber, nurseNumOfPatients);
        
        // Get inputs for Doctor
        scanner.nextLine(); // consume remaining newline character
        System.out.println("Enter name for Doctor:");
        String doctorName = scanner.nextLine();
        System.out.println("Enter number for Doctor:");
        int doctorNumber = scanner.nextInt();
        scanner.nextLine(); // consume remaining newline character
        System.out.println("Enter specialty for Doctor:");
        String doctorSpecialty = scanner.nextLine();
        Doctor michael = new Doctor(doctorName, doctorNumber, doctorSpecialty);
        
        // Get inputs for Surgeon
        System.out.println("Enter name for Surgeon:");
        String surgeonName = scanner.nextLine();
        System.out.println("Enter number for Surgeon:");
        int surgeonNumber = scanner.nextInt();
        scanner.nextLine(); // consume remaining newline character
        System.out.println("Enter specialty for Surgeon:");
        String surgeonSpecialty = scanner.nextLine();
        System.out.println("Is the Surgeon currently operating? (true/false):");
        boolean surgeonOperating = scanner.nextBoolean();
        Surgeon vincent = new Surgeon(surgeonName, surgeonNumber, surgeonSpecialty, surgeonOperating);
        
        // Get inputs for Nurse
        scanner.nextLine(); // consume remaining newline character
        System.out.println("Enter name for Nurse:");
        String nurseName2 = scanner.nextLine();
        System.out.println("Enter number for Nurse:");
        int nurseNumber2 = scanner.nextInt();
        System.out.println("Enter number of patients for Nurse:");
        int nurseNumOfPatients2 = scanner.nextInt();
        Nurse sonny = new Nurse(nurseName2, nurseNumber2, nurseNumOfPatients2);
        
        // Print employee details
        System.out.println(vito);
        System.out.println(michael);
        System.out.println(vincent);
        System.out.println(sonny);
        
        // Call work method for each employee
        vito.work();
        michael.work();
        vincent.work();
        sonny.work();
    }
}