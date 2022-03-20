/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author stanchen
 */
public class VitalSigns {
    private int systolicBloodPressure;
    private int diastolicBloodPressure;
    private int heartRate;
    private double weight;
    private double temperature;
    private boolean isAbnormal;
    private int age;

    public int getDiastolicBloodPressure() {
        return diastolicBloodPressure;
    }

    public void setDiastolicBloodPressure(int diastolicBloodPressure) {
        this.diastolicBloodPressure = diastolicBloodPressure;
    }

    public int getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(int systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isAbnormal() {
        if (this.isAbnormal){
            return "Yes";
        }else {
            return "No";
        }
    }

    public VitalSigns(int systolicBloodPressure, int diastolicBloodPressure,
                      int heartRate, double temperature, int age) {
        this.systolicBloodPressure = systolicBloodPressure;
        this.diastolicBloodPressure = diastolicBloodPressure;
        this.heartRate = heartRate;
        this.weight = weight;
        this.temperature = temperature;
        this.isAbnormal = checkVitalSign();
    }

    private Boolean checkVitalSign() {
        this.isAbnormal = false;

        if (this.age <= 25) {
            if (this.systolicBloodPressure > 120.5 || this.diastolicBloodPressure > 78.5) isAbnormal = true;
        } else if (this.age > 25 && this.age <= 30) {
            if (this.systolicBloodPressure > 119.5 || this.diastolicBloodPressure > 76.5) isAbnormal = true;
        } else if (this.age > 30 && this.age <= 35) {
            if (this.systolicBloodPressure > 114.5 || this.diastolicBloodPressure > 75.5) isAbnormal = true;
        } else if (this.age > 35 && this.age <= 40) {
            if (this.systolicBloodPressure > 120.5 || this.diastolicBloodPressure > 75.5) isAbnormal = true;
        } else if (this.age > 40 && this.age <= 45) {
            if (this.systolicBloodPressure > 115.5 || this.diastolicBloodPressure > 78.5) isAbnormal = true;
        } else if (this.age > 45 && this.age <= 50) {
            if (this.systolicBloodPressure > 119.5 || this.diastolicBloodPressure > 80.5) isAbnormal = true;
        } else if (this.age > 50 && this.age <= 55) {
            if (this.systolicBloodPressure > 125.5 || this.diastolicBloodPressure > 80.5) isAbnormal = true;
        } else if (this.age > 55 && this.age <= 60) {
            if (this.systolicBloodPressure > 129.5 || this.diastolicBloodPressure > 79.5) isAbnormal = true;
        } else if (this.age > 60 && this.age <= 65) {
            if (this.systolicBloodPressure > 143.5 || this.diastolicBloodPressure > 76.5) isAbnormal = true;
        }

        return isAbnormal;
    }
}
