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
public class City {
    private String name;
    private String state;
    private HashMap<String, Community> communities = new HashMap<>();

    public City(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Community getCommunity(String communityId) {
        return communities.get(communityId);
    }

    public String[] getAllCommunities(){
        return communities.values().stream().map(community -> community.getCommunityId()).toArray(String[]::new);
    }

    public void addCommunity(Community community) {
        this.communities.put(community.getCommunityId(), community);
    }

    public void updateCommunity(Community community) {
        this.communities.replace(community.getCommunityId(), community);
    }

    public void removeCommunity(String communityId){
        this.communities.remove(communityId);
    }

    public Boolean hasCommunity(String communityId){
        return this.communities.containsKey(communityId);
    }

}
