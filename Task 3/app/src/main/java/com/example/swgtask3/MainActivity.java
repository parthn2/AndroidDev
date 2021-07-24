package com.example.swgtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void SwitchWindowToClubs(View view) {
        Intent intent = new Intent( MainActivity.this , ClubsandSocieties.class);
        startActivity(intent);
    }

    public void SwitchWindowToStudyMaterial(View view) {
        Intent intent = new Intent( MainActivity.this , StudyMaterial.class);
        startActivity(intent);

    }


}