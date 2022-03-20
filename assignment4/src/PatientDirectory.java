
import model.Patient;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stanchen
 */
public class PatientDirectory {
    private HashMap<String, Patient> patients = new HashMap<>();
    private String patientDirectoryId;

    public PatientDirectory(String patientDirectoryId) {
        this.patientDirectoryId = patientDirectoryId;
    }

    public void addPatient(Patient patient){
        this.patients.put(patient.getFullName(), patient);
    }

    public void updatePatient(Patient patient){
        this.patients.replace(patient.getFullName(), patient);
    }

    public void removePatient(String patientId){
        this.patients.remove(patientId);
    }

    public Patient getPatient(String patientId){
        return this.patients.get(patientId);
    }

    public String getPatientDirectoryId() {
        return patientDirectoryId;
    }
}
