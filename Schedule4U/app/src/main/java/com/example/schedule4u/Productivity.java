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
        int total_leisure = 0;
        Activity_S4U_Data_Accessor accessor = new Activity_S4U_Data_Accessor(getApplicationContext(),true);
        List<Activity_S4U> displayList = accessor.lists.active;
        for (Activity_S4U myActivity : displayList){
            if (myActivity.importance_string == "Leisure"){
                total_leisure += myActivity.time_alotted;
            }
            if (myActivity.completed){
                total_finished += myActivity.time_alotted;
            }
            else {
                total_not_finished += myActivity.time_alotted;
            }
        }
        System.out.println("total_leisure: " + total_leisure);
        System.out.println("total_finished: " + total_finished);
        System.out.println("total_not_finished: " + total_not_finished);

    }
}