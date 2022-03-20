/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;

/**
 *
 * @author stanchen
 */
public class House {
    private HashMap<String, Person> residences = new HashMap<>();
    private String houseId;
    private String street1;
    private String street2;
    private int zip;

    public House(String houseId) {
        this.houseId = houseId;
    }

    public void addResidence(Person residence){
        this.residences.put(residence.getFullName(), residence);
    }

    public void updateResidence(Person residence){
        this.residences.replace(residence.getFullName(), residence);
    }

    public void removeResidence(String name){
        this.residences.remove(name);
    }

    public Residence getResidence(String name){
        return this.residences.get(name);
    }

    public String[] getAllResidences(){
        return this.residences.values().stream().map(person -> person.getFullName()).toArray(String[]::new);
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public Boolean hasResidence(String personId){
        return this.residences.containsKey(personId);
    }

}
