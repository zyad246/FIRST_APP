package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity<view> extends AppCompatActivity {
      Button nextbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextbutton = findViewById(R.id.nextbutton);
        nextbutton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Second.class);
            startActivity(intent);

        });
    }
}