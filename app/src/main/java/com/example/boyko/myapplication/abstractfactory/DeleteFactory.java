package com.example.boyko.myapplication.abstractfactory;

import android.content.Context;

import com.example.boyko.myapplication.dialogs.CustomDialog;
import com.example.boyko.myapplication.dialogs.DeleteDialog;
import com.example.boyko.myapplication.pushnotifications.CustomNotification;
import com.example.boyko.myapplication.pushnotifications.DeleteNotification;

/**
 * Created by boyko on 09.12.2017.
 */

public class DeleteFactory  implements Factory{
    private Context context;
    public DeleteFactory(Context context){
        this.context = context;
    }
    @Override
    public CustomDialog createDialog() {
        return new DeleteDialog(context);
    }

    @Override
    public CustomNotification createNotification() {
        return new DeleteNotification(context);
    }
}
