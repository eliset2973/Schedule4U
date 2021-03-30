package com.example.schedule4u;

import android.widget.CalendarView;
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
protected void onResume() {
    super.onResume();
    // change to content layout
    Activity_S4U_Data_Accessor accessor = new Activity_S4U_Data_Accessor(getApplicationContext(),true);
    List<Activity_S4U> displayList = accessor.lists.active;
    TextView textViewCalendarActivityName1 = (TextView) findViewById(R.id.textViewCalendarActivityName1);
    TextView textViewCalendarActivityName2 = (TextView) findViewById(R.id.textViewCalendarActivityName2);
    TextView textViewCalendarActivityName3 = (TextView) findViewById(R.id.textViewCalendarActivityName3);
    if (displayList.size()>0) {
        textViewCalendarActivityName1.setText(displayList.get(0).name);
        //System.out.println(displayList.get(0).name);
    } else {
        textViewCalendarActivityName1.setText("");
    }

    try {
        if (displayList.size()>1) {
            textViewCalendarActivityName2.setText(displayList.get(1).name);
        } else {
            textViewCalendarActivityName2.setText("");
        }
        if (displayList.size()>2) {
            textViewCalendarActivityName3.setText(displayList.get(2).name);
        } else {
            textViewCalendarActivityName3.setText("");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    CalendarView myCalendar = (CalendarView) findViewById(R.id.calendarView);
    long myDate = myCalendar.getDate();
    System.out.println (myDate);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton calendarAboutMe = (ImageButton) findViewById(R.id.button9);
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

        CalendarView myCalendar = (CalendarView) findViewById(R.id.calendarView);
        long myDate = myCalendar.getDate();
        System.out.println (myDate);
    }

}