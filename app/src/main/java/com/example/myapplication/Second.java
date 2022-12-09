package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Second extends AppCompatActivity {
       Button nextbutton2;
       Button backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nextbutton2 = findViewById(R.id.nextbutton2);
        nextbutton2.setOnClickListener(v -> {
            Intent intent = new Intent(Second.this, Third.class);
            startActivity(intent);

        });
        backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(v -> {
            Intent intent = new Intent(Second.this, MainActivity.class);
            startActivity(intent);
        });
    }
}