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
public class Community {
    private HashMap<String, House> houses = new HashMap<>();
    private String communityId;

    public Community(String communityName) {
        this.communityId = communityName;
    }

    public void addHouse(House house){
        this.houses.put(house.getHouseId(), house);
    }

    public void updateHouse(House house){
        this.houses.replace(house.getHouseId(), house);
    }

    public void removeHouse(String houseId){
        this.houses.remove(houseId);
    }

    public House getHouse(String houseId){
        return this.houses.get(houseId);
    }

    public String[] getAllHouse(){
        return this.houses.values().stream().map(house -> house.getHouseId()).toArray(String[]::new);
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public boolean hasHouse(String houseId){
        return this.houses.containsKey(houseId);
    }

}
