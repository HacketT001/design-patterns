package com.example.boyko.myapplication.abstractfactory;

import android.app.AlertDialog;
import android.content.Context;

import com.example.boyko.myapplication.dialogs.CustomDialog;
import com.example.boyko.myapplication.dialogs.WarningDialog;
import com.example.boyko.myapplication.pushnotifications.CustomNotification;
import com.example.boyko.myapplication.pushnotifications.WarningNotification;

/**
 * Created by boyko on 09.12.2017.
 */

public class WarningFactory implements Factory {
    private Context context;
    public WarningFactory(Context context){
        this.context = context;
    }

    @Override
    public CustomDialog createDialog() {
        return new WarningDialog(context);
    }

    @Override
    public CustomNotification createNotification() {
        return new WarningNotification(context);
    }
}
