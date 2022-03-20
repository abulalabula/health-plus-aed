package model;
import java.util.ArrayList;
import java.util.HashMap;
import model.VitalSigns;

public class EncounterHistory {
//    private HashMap<String, Encounter> encounters = new HashMap<>();
    private ArrayList<VitalSigns> encounters;
    private int systolicBloodPressure;
    private int diastolicBloodPressure;
    private int heartRate;
    private double weight;
    private double temperature;
    private boolean isAbnormal;
    private int age;
    public EncounterHistory() {
        this.encounters = new ArrayList<>();
    }

    public ArrayList<VitalSigns> getEncounter(){
        return encounters;
    }

    public void setEncounters (ArrayList<VitalSigns> encounters){
        this.encounters = encounters;
    }
    
    public VitalSigns addNewVitalSigns(){
    
        VitalSigns newVitalSigns = new VitalSigns(systolicBloodPressure, diastolicBloodPressure, heartRate, temperature, age);
        encounters.add(newVitalSigns);
        return  newVitalSigns;
    }
}