package com.company;

public class DataBase {

    private static DataBase instace;

    private DataBase() {

    }

    public static synchronized DataBase getInstace() {
        if (getInstace() == null)
            instace = new DataBase();

        return instace;
    }

    public String getData() {
        return "data";
    }
}
