package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ObjectPool {

    private ArrayList<MyObject> available = new ArrayList<>();
    private ArrayList<MyObject> inUse = new ArrayList<>();


    public MyObject getObject() throws Exception {

        if (!available.isEmpty()) {
            MyObject object = available.get(available.size() - 1);
            available.remove(object);
            inUse.add(object);
            return object;
        } else {
            MyObject object = new MyObject();
            inUse.add(object);
            return object;
        }
    }

    public void releaseObject(MyObject object) {
        object.cleanObject();
        inUse.remove(object);
        available.add(object);
    }



    public ArrayList<MyObject> getResourcesInUse(){
        return inUse;
    }

}
