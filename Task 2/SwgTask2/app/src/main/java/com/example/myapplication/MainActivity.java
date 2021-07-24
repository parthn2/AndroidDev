package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.example.myapplication.ENROL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.widget.Button Button = findViewById(R.id.enrollStudent);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Enrolled successfully",Toast.LENGTH_SHORT).show();
                EditText name = findViewById(R.id.studentName);
                EditText rollNo = findViewById(R.id.studentRollNo);
                Intent intent = new Intent( MainActivity.this , activityWelcome.class);
                String msg = rollNo.getText().toString() + " Successfully Enrolled. "+ "Welcome " + name.getText().toString();
                intent.putExtra( MSG, msg);
                startActivity(intent);
//                startActivity(new android.content.Intent(MainActivity.this, activityWelcome.class));

            }
        });
    }
}