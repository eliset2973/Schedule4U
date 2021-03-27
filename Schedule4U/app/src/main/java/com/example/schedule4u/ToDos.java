package com.example.schedule4u;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ToDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_dos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
///////////////////////////////////////


        Intent intent = getIntent();
        TextView name = (TextView)findViewById(R.id.eventtitletobeadded);
        TextView time = (TextView)findViewById(R.id.timetobeadded);
        TextView importance = (TextView)findViewById(R.id.prioritytobeadded);
        TextView location = (TextView)findViewById(R.id.locationtobeadded);

        // create the get Intent object


        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String Name = intent.getStringExtra("taskname");
        String Time = intent.getStringExtra("tasktime");
        String Importance = intent.getStringExtra("importancelevel");
        String Location = intent.getStringExtra("tasklocation");
        // display the string into textView
        name.setText(Name);
        time.setText(Time);
        importance.setText(Importance);
        location.setText(Location);


///////////////////////
        TextView name_1 = (TextView)findViewById(R.id.titletobeedited);
        TextView time_1 = (TextView)findViewById(R.id.timetobeedited);
        TextView importance_1 = (TextView)findViewById(R.id.prioritytobechanged);
        TextView location_1 = (TextView)findViewById(R.id.locationtobeedited);

        // create the get Intent object


        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String Name_1 = intent.getStringExtra("taskNM");
        String Time_1 = intent.getStringExtra("taskTM");
        String Importance_1 = intent.getStringExtra("importanceLv");
        String Location_1 = intent.getStringExtra("taskLc");
        // display the string into textView
        name_1.setText(Name_1);
        time_1.setText(Time_1);
        importance_1.setText(Importance_1);
        location_1.setText(Location_1);



//        TextView name_ = (TextView)findViewById(R.id.titletobeedited);
//        TextView time_ = (TextView)findViewById(R.id.timetobeedited);
//        TextView importance_ = (TextView)findViewById(R.id.prioritytobechanged);
//        TextView location_ = (TextView)findViewById(R.id.locationtobeedited);
//
//        // create the get Intent object
//
//
//        // receive the value by getStringExtra() method
//        // and key must be same which is send by first activity
//        String Name_ = intent.getStringExtra("taskname_");
//        String Time_ = intent.getStringExtra("tasktime_");
//        String Importance_ = intent.getStringExtra("importancelevel_");
//        String Location_ = intent.getStringExtra("tasklocation_");
//        // display the string into textView
//        name_.setText(Name_);
//        time_.setText(Time_);
//        importance_.setText(Importance_);
//        location_.setText(Location_);




        ///////////////////////////
        // A TEST TO SEE IF TASK INFO CAN BE TRANSMITTED ACROSS DIFFERENT ACTIVITIES
//        TextView text = (TextView)findViewById(R.id.textView44);
//        Intent intent = getIntent();
//        String str = intent.getStringExtra("event");
//        text.setText(str);

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
        //ImageButton toDosAboutMe = (ImageButton) findViewById(R.id.todos_aboutme);
        ImageButton toDosAboutMe = (ImageButton) findViewById(R.id.todos_aboutme2);
        toDosAboutMe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), create_event_edit.class);
                startActivityForResult(myIntent, 0);
            }

        });

        //create a task page is populated when this button is clicked
        Button createTask = (Button) findViewById(R.id.addNewTask);
        createTask.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), CreateTask.class);
                startActivityForResult(myIntent, 0);
            }

        });

        // the edit button is here
        Button editTask = (Button) findViewById(R.id.edit2);
        editTask.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), create_event_edit.class);
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