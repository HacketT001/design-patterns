package com.company;

public class MyObject {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public MyObject(){

    }

    public void cleanObject(){
        data = null;
    }
}
