
package com.example.schedule4u;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class DeletedItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deleted_items);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("deletedItem");
        System.out.print("printing message");
        System.out.print(Name);
        TextView textView56 = (TextView) findViewById(R.id.textView56);
        textView56.setText(Name);

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
        Button homeFromDelete = (Button) findViewById(R.id.HomeButton);
        homeFromDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });

        //Be careful! This is code for image button not ordinarily button//
        ImageButton homebutton_2= (ImageButton) findViewById(R.id.homebutton2);
        homebutton_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        //Be careful! This is code for image button not ordinarily button//

    }
}