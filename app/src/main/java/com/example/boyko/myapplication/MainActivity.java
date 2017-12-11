package com.example.boyko.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.boyko.myapplication.dialogs.CustomDialog;
import com.example.boyko.myapplication.dialogs.DeleteDialog;
import com.example.boyko.myapplication.factorymethod.DeleteDialogCreator;
import com.example.boyko.myapplication.factorymethod.DialogCreator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogCreator creator = new DeleteDialogCreator(MainActivity.this);
                creator.createDialog().build();
            }
        });
    }
}
