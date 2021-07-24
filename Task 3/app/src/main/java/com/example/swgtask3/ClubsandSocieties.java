package com.example.swgtask3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ClubsandSocieties extends AppCompatActivity{
    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubsand_societies);

        listView = findViewById(R.id.listView);

        List<String> title = new ArrayList<>();
        List<Integer> image = new ArrayList<>();

        title.add("SWG");
        title.add("Communique");
        title.add("Gramoire of code");

        image.add(R.drawable.swg);
        image.add(R.drawable.cq);
        image.add(R.drawable.goc);

        MyAdapter myAdapter = new MyAdapter(this, title, image);
        listView.setAdapter(myAdapter);
    }
}