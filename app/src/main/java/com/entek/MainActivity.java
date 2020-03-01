package com.entek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if (intent.getStringExtra("Name") != null) {
            Toast.makeText(this, "Thank you, " + intent.getStringExtra("Name") +
                            ", your information has been saved.", Toast.LENGTH_LONG).show();
        }
    }

    public void portfolio(View view){
        Intent moveToNextActivity = new Intent(this, Main2Activity.class);
        startActivity(moveToNextActivity);
    }

    public void contactUs(View view){
        Intent moveToNextActivity = new Intent(this, Main3Activity.class);
        startActivity(moveToNextActivity);
    }
}
