/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author stanchen
 */
public class Patient extends Person{
    private EncounterHistory encounterHistory;

    public Patient(String firstName, String lastName, int age, String gender) {
        super(firstName, lastName, age, gender);
        encounterHistory = new EncounterHistory();
    }

    public String isAbnormal(){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);
        if(rand_int1 - 5 > 0){
            return "Yes";
        } else{
            return "No";
        }
        //String[] encounters = this.encounterHistory.getAllEncounters();
//        for (int i=0; i<encounters.length;i++){
//            if (this.encounterHistory.getEncounter(encounters[i]).
//                    getVitalSign().isAbnormal().equals("Yes")){
//                return "Yes";
//            }
//        }
//
//        return "No";
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }
}
