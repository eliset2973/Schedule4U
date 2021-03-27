package com.example.schedule4u;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        Button edittask=(Button)findViewById(R.id.Editeventsubmit);
        edittask.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button edittask=(Button)findViewById(R.id.Editeventsubmit);
                EditText tasknameinput=(EditText)findViewById(R.id.AddTask);
                EditText timeinput=(EditText)findViewById(R.id.startTIME);
                EditText importanceinput=(EditText)findViewById(R.id.Levelofimportance);
                EditText locationinput=(EditText)findViewById(R.id.moreDetails);
                String taskname_1 = tasknameinput.getText().toString();
                String tasktime_1 = timeinput.getText().toString();
                String importancelevel_1= importanceinput.getText().toString();
                String tasklocation_1= locationinput.getText().toString();
                Intent intent = new Intent(getApplicationContext(), ToDos.class);
                intent.putExtra("taskNM", taskname_1);
                intent.putExtra("taskTM", tasktime_1);
                intent.putExtra("importanceLv", importancelevel_1);
                intent.putExtra("taskLc", tasklocation_1);
                startActivity(intent);
            }
        });

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
