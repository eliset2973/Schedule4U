package com.example.schedule4u;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


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

        Bitmap originalImage = BitmapFactory.decodeResource(getResources(), R.drawable.prod_yellow_bar);
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();

        Matrix matrix = new Matrix();
        float scaleWidth = ((float) width/2) / width;
        float scaleHeight = ((float) height/2) / height;
        matrix.postScale(scaleWidth, scaleHeight);


        Bitmap resizedBitmap = Bitmap.createBitmap(originalImage, 0, 0, width, height, matrix, true);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        resizedBitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
        ImageView im=(ImageView)findViewById(R.id.prod_rectangle2);
        im.setImageBitmap(resizedBitmap);



//        ImageView imageView = findViewById(R.id.bar);
//        ViewGroup.LayoutParams params = (ViewGroup.LayoutParams) imageView.getLayoutParams();
//        params.width = 120;
//        imageView.setLayoutParams(params);

//        float percentageFinished = (float) 0.5;
//        DisplayMetrics displaymetrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
//        int screenHeight = displaymetrics.heightPixels;
//        int screenWidth = displaymetrics.widthPixels;
//        ImageView myImageView = findViewById(R.id.bar);
////        int imgHeight = (int) (screenHeight * 0.08);
//        int imgWidth =  (int) (screenWidth * 0.4 * percentageFinished);
////        myImageView.getLayoutParams().height = imgHeight;
//        myImageView.getLayoutParams().width = imgWidth;

    }
}