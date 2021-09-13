package com.example.swgtask4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class AddSocietitesActivity extends AppCompatActivity {

    private EditText name,description,logo,fbLink;
    private Button addToDatabaseButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_societites);

        name = findViewById(R.id.SocName);
        description = findViewById(R.id.SocDescription);
        logo = findViewById(R.id.SocLogo);
        fbLink = findViewById(R.id.SocFBlink);
        addToDatabaseButton = findViewById(R.id.button);

        addToDatabaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                HashMap<String, Object> map = new HashMap<>();
                map.put("name", name.getText().toString());
                map.put("description", description.getText().toString());
                map.put("logo", logo.getText().toString());
                map.put("fbLink", fbLink.getText().toString());

                FirebaseDatabase.getInstance().getReference().push().setValue(map);

            }
        });


    }

}