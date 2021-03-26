package com.example.schedule4u;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
public class CreateTask extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createtask);

        ImageButton homebutton_create= (ImageButton) findViewById(R.id.homebutton3);
        homebutton_create.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button submitNewTask = (Button) findViewById(R.id.createNewTaskSubmit);
        submitNewTask.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText taskName = (EditText)findViewById(R.id.addTask); //this line grabs the form input
                String task = taskName.getText().toString(); //this line casts it to a string
                EditText taskTime = (EditText)findViewById(R.id.timeForTask); //this line grabs the form input
                String time = taskTime.getText().toString(); //this line casts it to a string
                EditText taskDateBy = (EditText)findViewById(R.id.completeDay); //this line grabs the form input
                String dateBy = taskDateBy.getText().toString(); //this line casts it to a string
                RadioGroup importanceLevel = (RadioGroup)findViewById(R.id.importanceLevel);
                int level = importanceLevel.getCheckedRadioButtonId();
                String levelVal = Integer.valueOf(level).toString(); //convert the value of importance to a string val
                EditText taskStartTime = (EditText)findViewById(R.id.startTime); //this line grabs the form input
                String start = taskStartTime.getText().toString(); //this line casts it to a string
                EditText taskEndTime = (EditText)findViewById(R.id.endTime); //this line grabs the form input
                String end = taskEndTime.getText().toString(); //this line casts it to a string
                EditText taskExtraDetails = (EditText)findViewById(R.id.extraDetails); //this line grabs the form input
                String extraDetails = taskExtraDetails.getText().toString(); //this line casts it to a string
                EditText taskDaysNum = (EditText)findViewById(R.id.taskDays); //this line grabs the form input
                String daysNum = taskDaysNum.getText().toString(); //this line casts it to a string
                Intent myIntent = new Intent(view.getContext(), ToDos.class);

                // THIS IS A TEST TO SEE IF DATA IS SENT TO DIFFERENT ACTIVITIES
                myIntent.putExtra("event", task);
                startActivityForResult(myIntent, 0);
            }

        });
    }


}
