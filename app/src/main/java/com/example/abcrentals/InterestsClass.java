package com.example.abcrentals;

import java.io.Serializable;

//Model class to fetch data from firestore
public class InterestsClass implements Serializable {


    private String address, nutrition, contactNumber,description,imageUri,name;

    public InterestsClass() {

    }

    public InterestsClass(String address, String nutrition, String contactNumber, String description, String imageUri,String name) {
        this.address = address;
        this.nutrition = nutrition;
        this.contactNumber = contactNumber;
        this.description  = description;
        this.imageUri = imageUri;
        this.name = name;


    }


    public String getName() {
        return name;
    }

    public String getImageUri() {
        return imageUri;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress () {
        return address;
    }

    public String getContactNumber () {
        return contactNumber;
    }

    public String getNutrition() {return nutrition;}


    }


