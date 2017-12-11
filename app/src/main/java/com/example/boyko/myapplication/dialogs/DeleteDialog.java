package com.example.boyko.myapplication.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by boyko on 09.12.2017.
 */

public class DeleteDialog  implements CustomDialog {
    private Context context;
    public DeleteDialog(Context context){
        this.context = context;
    }
    @Override
    public AlertDialog build() {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Delete")
                .setMessage("Do you want to delete?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        return builder.create();
    }
}
