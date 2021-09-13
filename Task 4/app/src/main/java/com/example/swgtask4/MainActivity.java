package com.example.swgtask4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addPressed(View view) {
        Intent intent = new Intent(MainActivity.this, AddSocietitesActivity.class);
        startActivity(intent);
    }

    public void viewPressed(View view) {
        Intent intent = new Intent(MainActivity.this, ViewSocietiesActivity.class);
        startActivity(intent);
    }
}