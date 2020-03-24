package com.example.abcrentals;

import java.io.Serializable;

public class Searches implements Serializable {


    private String description, image, name,location,contactNumber,image2, nutrition;

    public Searches() {}

    public Searches(String description, String image, String name, String location,String contactNumber,String image2,String nutrition) {
        this.description = description;
        this.image = image;
        this.name = name;
        this.location = location;
        this.contactNumber = contactNumber;
        this.image2 = image2;
        this.nutrition   = nutrition;

    }


    public String getname() {
        return name;
    }

    public String getimage() {
        return image;
    }

    public String getdescription() {
        return description;
    }

    public String getlocation () {
        return location;
    }


    public String getcontactNumber () {
        return contactNumber;
    }

public String getnutrition() { return nutrition;}
    public String getImage2()
    {
        return image2;
    }



}


