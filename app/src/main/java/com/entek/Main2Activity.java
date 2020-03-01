package com.entek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void caribbean(View view){
        imageView = findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.caribbean);
    }

    public void contemporary(View view){
        imageView = findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.contemporary);
    }

    public void balinese(View view){
        imageView = findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.balinese);
    }

    public void mediterranean(View view){
        imageView = findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.mediterranean);
    }

    public void back(View view){
        Intent moveToNextActivity = new Intent(this, MainActivity.class);
        startActivity(moveToNextActivity);
    }
}
