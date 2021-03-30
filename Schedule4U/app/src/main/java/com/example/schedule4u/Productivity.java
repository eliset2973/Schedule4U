package com.example.schedule4u;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;
import java.util.List;

import android.widget.ProgressBar;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class Productivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productivity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton productivityAboutMe = findViewById(R.id.prod_aboutme);
        productivityAboutMe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ProductivityAboutMe.class);
                startActivityForResult(myIntent, 0);
            }

        });


        ImageButton homebutton_6= findViewById(R.id.prod_home);
        homebutton_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        int total_finished = 0;
        int total_not_finished = 0;
        Activity_S4U_Data_Accessor accessor = new Activity_S4U_Data_Accessor(getApplicationContext(),true);
        List<Activity_S4U> displayList = accessor.lists.active;
        for (Activity_S4U myActivity : displayList){
            if (myActivity.completed){
                total_finished += myActivity.time_alotted;
            }
            else {
                total_not_finished += myActivity.time_alotted;
            }
        }
        int total = total_not_finished+total_finished;
        System.out.println("total_finished: " + total_finished);
        System.out.println("total_not_finished: " + total_not_finished);
        String finished = "Finished tasks: "+total_finished/60 + "hr " + total_finished%60 + "min";
        String not_finished = "Tasks still in progress: "+total_not_finished/60 + "hr " + total_not_finished%60 + "min";
        TextView old_finished = (TextView) findViewById(R.id.prod_text2);
        old_finished.setText(finished);
        TextView old_not_finished = (TextView) findViewById(R.id.prod_text1);
        old_not_finished.setText(not_finished);
        ProgressBar progressBar1= (ProgressBar) findViewById(R.id.progressBar1);
        progressBar1.setProgress(total_not_finished*100/total);
        ProgressBar progressBar2= (ProgressBar) findViewById(R.id.progressBar2);
        progressBar2.setProgress(total_finished*100/total);

    }

    protected void onResume(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productivity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        int total_finished = 0;
        int total_not_finished = 0;
        Activity_S4U_Data_Accessor accessor = new Activity_S4U_Data_Accessor(getApplicationContext(),true);
        List<Activity_S4U> displayList = accessor.lists.active;
        for (Activity_S4U myActivity : displayList){
            if (myActivity.completed){
                total_finished += myActivity.time_alotted;
            }
            else {
                total_not_finished += myActivity.time_alotted;
            }
        }
        int total = total_not_finished+total_finished;
        System.out.println("total_finished: " + total_finished);
        System.out.println("total_not_finished: " + total_not_finished);
        String finished = "Finished tasks: "+total_finished/60 + "hr " + total_finished%60 + "min";
        String not_finished = "Tasks still in progress: "+total_not_finished/60 + "hr " + total_not_finished%60 + "min";
        TextView old_finished = (TextView) findViewById(R.id.prod_text2);
        old_finished.setText(finished);
        TextView old_not_finished = (TextView) findViewById(R.id.prod_text1);
        old_not_finished.setText(not_finished);
        ProgressBar progressBar1= (ProgressBar) findViewById(R.id.progressBar1);
        progressBar1.setProgress(total_not_finished*100/total);
        ProgressBar progressBar2= (ProgressBar) findViewById(R.id.progressBar2);
        progressBar2.setProgress(total_finished*100/total);

    }
}