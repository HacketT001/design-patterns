package com.company;

import java.util.ArrayList;

public class DB {
    private static DB instance = new DB();

    public static DB getInstance() {
        return instance;
    }

    public ArrayList<String> getAdditionalInfo(){
        return new ArrayList<>();
    }
}
