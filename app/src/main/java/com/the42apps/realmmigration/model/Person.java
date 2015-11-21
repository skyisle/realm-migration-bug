package com.the42apps.realmmigration.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by skyisle on 11/21/15.
 */
public class Person extends RealmObject {
    @PrimaryKey
    private String userId;
    private String userName;
    private String gender;
    private String imagePath; // user image path on app asset server
    private String phoneNumber; // Mobile Phone Number (E164 format)
    private String contactName; // Acquaintance name on contact book or Facebook friend name or app user name
    private int birthYear;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
