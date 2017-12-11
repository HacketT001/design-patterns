package com.example.boyko.myapplication.factorymethod;

import android.app.AlertDialog;
import android.content.Context;

import com.example.boyko.myapplication.dialogs.CustomDialog;

/**
 * Created by boyko on 09.12.2017.
 */

public interface DialogCreator {
    CustomDialog createDialog();

}
