package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activityWelcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.MSG);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(msg);
    }
}