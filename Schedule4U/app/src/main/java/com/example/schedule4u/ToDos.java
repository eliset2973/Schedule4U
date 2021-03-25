package com.example.schedule4u;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ToDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_dos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        //for some reason I'm having trouble linking the button to the proper page.
        //when you link it to a page like the ToDos or something, it works fine. But not
        //for the class that I just created
        Button toDosAboutMe = (Button) findViewById(R.id.toDosAboutMe);
        toDosAboutMe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ToDosAboutMe.class);
                startActivityForResult(myIntent, 0);
            }

        });

        //create a task page is populated when this button is clicked
        Button createTask = (Button) findViewById(R.id.createTaskButton);
        createTask.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), CreateTask.class);
                startActivityForResult(myIntent, 0);
            }

        });

//Be careful! This is code for image button not ordinarily button//
        ImageButton homebutton_10= (ImageButton) findViewById(R.id.homebutton10);
        homebutton_10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        //Be careful! This is code for image button not ordinarily button//
    }
}