package com.example.schedule4u;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.util.DisplayMetrics;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.ImageView;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

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

        float percentageFinished = (float) 0.5;
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int screenHeight = displaymetrics.heightPixels;
        int screenWidth = displaymetrics.widthPixels;
        ImageView myImageView = findViewById(R.id.bar);
        int imgHeight = (int) (screenHeight * 0.08);
        int imgWidth =  (int) (screenWidth * 0.4 * percentageFinished);
        myImageView.getLayoutParams().height = imgHeight;
        myImageView.getLayoutParams().width = imgWidth;

    }
}