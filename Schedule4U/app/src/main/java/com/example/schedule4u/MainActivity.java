package com.example.schedule4u;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // to do's for today screen
        Button todo = (Button) findViewById(R.id.button2);
        todo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ToDos.class);
                startActivityForResult(myIntent, 0);
            }

        });

        // notifications screen
        Button notif = (Button) findViewById(R.id.button);
        notif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Notifications.class);
                startActivityForResult(myIntent, 0);
            }

        });

        // recommendations screen
        Button recommend = (Button) findViewById(R.id.button3);
        recommend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Recommendations.class);
                startActivityForResult(myIntent, 0);
            }

        });

        // calendar screen
        Button calend = (Button) findViewById(R.id.button4);
        calend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Calendar.class);
                startActivityForResult(myIntent, 0);
            }

        });

        // productivity screen
        Button product = (Button) findViewById(R.id.button5);
        product.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Productivity.class);
                startActivityForResult(myIntent, 0);
            }

        });

    }


}