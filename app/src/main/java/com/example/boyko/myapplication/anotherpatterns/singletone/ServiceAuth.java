package com.company;

public class ServiceAuth {

    private static ServiceAuth instance;

    private ServiceAuth() {

    }

    public static synchronized ServiceAuth getInstance() {
        if (instance == null)
            instance = new ServiceAuth();
        return instance;
    }

    public boolean registerByEmailAndPassword(String email, String pass) {
        return true;
    }
}
