package com.example.boyko.myapplication.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by boyko on 09.12.2017.
 */

public class WarningDialog implements CustomDialog {
    private Context context;
    public WarningDialog(Context context){
        this.context = context;
    }
    @Override
    public AlertDialog build() {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Warning!")
                .setMessage("Warning!")
                .setCancelable(false)
                .setPositiveButton("Ok. I understand.", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        return builder.create();
    }
}
