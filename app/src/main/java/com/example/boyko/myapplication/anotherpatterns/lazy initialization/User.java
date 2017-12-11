package com.company;

import java.util.ArrayList;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    private ArrayList<String> someAdditionalInfo;

    private ArrayList<String> someAdditionalInfoFromDB;


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<String> getSomeAdditionalInfo() {
        if (someAdditionalInfo == null) {
            someAdditionalInfo = new ArrayList<>();
            someAdditionalInfo.add("First block of info");
            someAdditionalInfo.add("Second block of info");
            return someAdditionalInfo;
        } else
            return someAdditionalInfo;
    }



    public ArrayList<String> getSomeAdditionalFromDB() {
        if (someAdditionalInfoFromDB == null){
            someAdditionalInfo = DB.getInstance().getAdditionalInfo();
            return someAdditionalInfoFromDB;
        } else
            return someAdditionalInfoFromDB;
    }
}
