package com.example.schedule4u;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
public class create_event_edit extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createventedit);

        ImageButton homebutton_create= (ImageButton) findViewById(R.id.HOMEB3);
        homebutton_create.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ////////////



//        Button addtask=(Button)findViewById(R.id.CreateNewTaskSubmit);
//        EditText nameoftask=(EditText)findViewById(R.id.AddTask);
//        EditText timeoftask=(EditText)findViewById(R.id.startTIME);
//        EditText levelofimportance=(EditText)findViewById(R.id.Levelofimportance);
//        EditText location=(EditText)findViewById(R.id.moreDetails);
//        addtask.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                String taskname = nameoftask.getText().toString();
//                String tasktime = timeoftask.getText().toString();
//                String importancelevel= levelofimportance.getText().toString();
//                String tasklocation= location.getText().toString();
//                Intent intent = new Intent(getApplicationContext(), ToDos.class);
//                intent.putExtra("taskname", taskname);
//                intent.putExtra("tasktime", tasktime);
//                intent.putExtra("importancelevel", importancelevel);
//                intent.putExtra("tasklocation", tasklocation);
//                startActivity(intent);
//            }
//        });















    }


}
