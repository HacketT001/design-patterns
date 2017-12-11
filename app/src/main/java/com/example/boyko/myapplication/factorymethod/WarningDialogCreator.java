package com.example.boyko.myapplication.factorymethod;

import android.app.AlertDialog;
import android.content.Context;

import com.example.boyko.myapplication.dialogs.CustomDialog;
import com.example.boyko.myapplication.dialogs.WarningDialog;

/**
 * Created by boyko on 09.12.2017.
 */

public class WarningDialogCreator implements DialogCreator {
    private Context context;
    public WarningDialogCreator(Context context){
        this.context = context;
    }
    @Override
    public CustomDialog createDialog() {
        return new WarningDialog(context);
    }
}
