package com.codingal.autheticatorapp;



import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView Codingal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // initialising all views through id defined above
        Codingal = findViewById(R.id.codingal);
        Codingal.setText(
                "Codingal (Firebase Authentication)");
    }
}
