package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Third extends AppCompatActivity {
       Button backbutton2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        backbutton2 = findViewById(R.id.backbutton2);

        backbutton2.setOnClickListener(v -> {
            Intent intent = new Intent(Third.this, Second.class);
            startActivity(intent);
        });
    }
}