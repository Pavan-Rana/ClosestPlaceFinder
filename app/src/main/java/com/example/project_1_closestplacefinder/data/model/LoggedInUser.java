package com.example.project_1_closestplacefinder.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String userId;
    private String displayName;
    private Integer pass;
    private Integer caught;

    public LoggedInUser(String userId, String displayName) {
        this.userId = userId;
        this.displayName = displayName;
        this.pass = 0;
        this.caught = 9;
    }

    public String getUserId() {pass++; return userId;}

    public String getDisplayName() {this.caught = this.pass; return displayName;}
}