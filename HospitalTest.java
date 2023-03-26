import org.junit.Test;
import static org.junit.Assert.*;

public class HospitalTest {
  
  @Test
  public void testHospitalEmployee() {
    HospitalEmployee employee = new HospitalEmployee("John", 123);
    assertEquals("John", employee.getName());
    assertEquals(123, employee.getNumber());
    employee.setName("Jane");
    employee.setNumber(456);
    assertEquals("Jane", employee.getName());
    assertEquals(456, employee.getNumber());
    assertEquals("Jane works for the hospital.", employee.work());
  }
  
  @Test
  public void testDoctor() {
    Doctor doctor = new Doctor("Michael", 234, "Heart");
    assertEquals("Michael", doctor.getName());
    assertEquals(234, doctor.getNumber());
    assertEquals("Heart", doctor.getSpecialty());
    doctor.setSpecialty("Brain");
    assertEquals("Brain", doctor.getSpecialty());
    assertEquals("Michael works for the hospital. Michael is a(n) Brain doctor.", doctor.work());
  }
  
  @Test
  public void testSurgeon() {
    Surgeon surgeon = new Surgeon("Vincent", 645, "Brain", true);
    assertEquals("Vincent", surgeon.getName());
    assertEquals(645, surgeon.getNumber());
    assertEquals("Brain", surgeon.getSpecialty());
    assertEquals(true, surgeon.isOperating());
    surgeon.setOperating(false);
    assertEquals(false, surgeon.isOperating());
    assertEquals("Vincent works for the hospital. Vincent is not operating now.", surgeon.work());
  }
  
  @Test
  public void testNurse() {
    Nurse nurse = new Nurse("Sonny", 789, 6);
    assertEquals("Sonny", nurse.getName());
    assertEquals(789, nurse.getNumber());
    assertEquals(6, nurse.getNumOfPatients());
    nurse.setNumOfPatients(8);
    assertEquals(8, nurse.getNumOfPatients());
    assertEquals("Sonny works for the hospital. Sonny is a nurse with 8 patients.", nurse.work());
  }
  
}