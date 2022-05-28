package com.mibalstudio.mathforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox examplesCheckBox;

    CheckBox comparisonsCheckBox;

    CheckBox tasksCheckBox;

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        examplesCheckBox = findViewById(R.id.examplesCheckBox);
        comparisonsCheckBox = findViewById(R.id.comparisonsCheckBox);
        tasksCheckBox = findViewById(R.id.tasksCheckBox);

        startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(v -> {

            if(((CheckBox) examplesCheckBox).isChecked()){

            }


            Intent intent = new Intent();//class


        });
    }


}