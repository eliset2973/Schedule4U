package com.example.schedule4u;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

public class Calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // This block tests functionality of saving data
        /* Activity_S4U_Data_Accessor accessor = new Activity_S4U_Data_Accessor(getApplicationContext(),true);
        List<Activity_S4U> printList = accessor.lists.active;
        for (int i = 0; i<printList.size(); i++) System.out.println(printList.get(i).name);
        /*printList.add(new Activity_S4U());
        printList.get(5).name = printList.get(5).name + " 6 (test adding)";
        accessor.save(getApplicationContext());
        accessor.load(getApplicationContext());
        printList = accessor.lists.active;
        for (int i = 0; i<printList.size(); i++) System.out.println(printList.get(i).name);*/

        // change to content layout
        Activity_S4U_Data_Accessor accessor = new Activity_S4U_Data_Accessor(getApplicationContext(),true);
        List<Activity_S4U> displayList = accessor.lists.active;
        //setContentView(R.layout.content_calendar);

        TextView textViewCalendarActivityName1 = (TextView) findViewById(R.id.textViewCalendarActivityName1);
        textViewCalendarActivityName1.setText(displayList.get(0).name);
        System.out.println(displayList.get(0).name);

        try {
            ((TextView) findViewById(R.id.textViewCalendarActivityName2)).setText(displayList.get(1).name);
            ((TextView) findViewById(R.id.textViewCalendarActivityName3)).setText(displayList.get(2).name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(((TextView) findViewById(R.id.textViewCalendarActivityName2)).getText());

        //change back to activity layout
        //setContentView(R.layout.activity_calendar);

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
        Button calendarAboutMe = (Button) findViewById(R.id.button9);
        calendarAboutMe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), CalendarAboutMe.class);
                startActivityForResult(myIntent, 0);
            }

        });



        //Be careful! This is code for image button not ordinarily button//
        ImageButton homebutton_0= (ImageButton) findViewById(R.id.homebutton);
        homebutton_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        //Be careful! This is code for image button not ordinarily button//


    }
}