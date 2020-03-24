package com.example.abcrentals;



import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.PropertyName;


@IgnoreExtraProperties
public class Record {
        @PropertyName("ContactNumber")
        private String ContactNumber;

        @PropertyName("Description")
        private String Description;

        @PropertyName("Image")
        private String Image;

        @PropertyName("Image2")
        private String Image2;

        @PropertyName("Location")
        private String Location;

        @PropertyName("Name")
        private String Name;

        @PropertyName("Nutrition")
        private String Nutrition;

        public Record() {}




        public Record(String ContactNumber, String Description,String Image,String Image2,String Location, String Name,String Nutrition) {

            this.ContactNumber = ContactNumber;
            this.Description = Description;
            this.Image = Image;
            this.Image2 = Image2;
            this.Location = Location;
            this.Name = Name;
            this.Nutrition = Nutrition;
        }



        @Exclude
        @PropertyName("ContactNumber")
        public String getContactNumber() {
            return ContactNumber;
        }
        @Exclude
        @PropertyName("ContactNumber")
        public void setContactNumber(String ContactNumber) {
            this.ContactNumber = ContactNumber;
        }

        @Exclude
        @PropertyName("Location")
        public String getLocation() {
            return Location;
        }
       // @PropertyName("Location")
       @Exclude
       @PropertyName("Location")
        public void setLocation(String Location) {
            this.Location = Location;
        }

       // @PropertyName("Name")
       @Exclude
        public String getName() {
            return Name;
        }
      //  @PropertyName("Name")
      @Exclude
        public void setName(String Name) {
            this.Name = Name;
        }

       // @PropertyName("Description")
       @Exclude
        public String getDescription() {
            return Description;
        }
       // @PropertyName
       @Exclude
        public void setDescription(String Description) {
            this.Description = Description;
        }

      //  @PropertyName("Image")
      @Exclude
        public String getImage2() {
            return Image2;
        }
       // @PropertyName("Image")
       @Exclude
        public void setImage2(String Image2) {
            this.Image = Image2;
        }

       // @PropertyName
       @Exclude
        public String getImage() {
            return Image;
        }
    @Exclude
        public void setImage(String Image) {
            this.Image = Image;
        }

    @Exclude
        public String getNutrition() {
            return Nutrition;
        }
       // @PropertyName("Nutrition")
       @Exclude
        public void setNutrition(String Nutrition) {
            this.Nutrition = Nutrition;
        }
}
