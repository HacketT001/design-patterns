package com.example.boyko.myapplication.abstractfactory;

import android.app.AlertDialog;
import android.content.Context;

import com.example.boyko.myapplication.dialogs.CustomDialog;
import com.example.boyko.myapplication.pushnotifications.CustomNotification;
import com.example.boyko.myapplication.pushnotifications.WarningNotification;

/**
 * Created by boyko on 09.12.2017.
 */

public interface Factory {
    CustomDialog createDialog();
    CustomNotification createNotification();
}
