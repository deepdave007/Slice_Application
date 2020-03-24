package com.example.abcrentals;

import java.io.Serializable;

public class NewRecords implements Serializable {


        private String address, contactNumber, description,imageUri,Name, Nutrition;


        public NewRecords(String address, String contactNumber, String description, String imageUri,String Name,String Nutrition) {
            this.address = address;
            this.contactNumber = contactNumber;
            this.Name = Name;
            this.description = description;
            this.imageUri = imageUri;
            this.Nutrition   = Nutrition;

        }


        public String getName() {
            return Name;
        }

        public String getImage() {
            return imageUri;
        }

        public String getDescription() {
            return description;
        }

        public String getLocation () {
            return address;
        }


        public String getContactNumber () {
            return contactNumber;
        }

        public String getNutrition() { return Nutrition;}




}
