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