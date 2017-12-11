package com.example.boyko.myapplication.factorymethod;

import android.app.AlertDialog;
import android.content.Context;

import com.example.boyko.myapplication.dialogs.CustomDialog;
import com.example.boyko.myapplication.dialogs.DeleteDialog;

/**
 * Created by boyko on 09.12.2017.
 */

public class DeleteDialogCreator implements DialogCreator {
    private Context context;
    public DeleteDialogCreator(Context context){
        this.context = context;
    }
    @Override
    public CustomDialog createDialog() {
        return new DeleteDialog(context);
    }
}
