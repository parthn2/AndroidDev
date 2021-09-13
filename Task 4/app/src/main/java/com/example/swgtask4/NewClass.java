package com.example.swgtask4;

public class NewClass {

    private String description;
//    private String fbLink;
    private String logo;
    private String name;
    NewClass()
    {
        this.name = "fads";
        this.description = "This is the description";
        this.logo = "This is the logo";
    }

    public NewClass(String description, String fbLink, String logo, String name) {

        this.description = description;
//        this.fbLink = fbLink;
//        this.logo = logo;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//
//    public String getFbLink() {
//        return fbLink;
//    }
//
//    public void setFbLink(String fbLink) {
//        this.fbLink = fbLink;
//    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}