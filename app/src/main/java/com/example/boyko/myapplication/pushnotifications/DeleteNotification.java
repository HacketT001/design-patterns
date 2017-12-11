package com.example.boyko.myapplication.pushnotifications;

import android.app.Notification;
import android.content.Context;

/**
 * Created by boyko on 09.12.2017.
 */

public class DeleteNotification implements CustomNotification{

    Context context;
    public DeleteNotification(Context context){
        this.context = context;
    }
    @Override
    public Notification build() {
        // build notification
        return null;
    }
}
