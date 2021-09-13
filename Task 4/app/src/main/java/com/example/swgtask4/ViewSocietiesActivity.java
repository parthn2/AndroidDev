package com.example.swgtask4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ViewSocietiesActivity extends AppCompatActivity {
    private RecyclerView societyList;
    private DatabaseReference mDatabase;

    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_societies);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.keepSynced((true));

        societyList = (RecyclerView) findViewById(R.id.myRecyclerview);
        societyList.setHasFixedSize(true);
        societyList.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<NewClass> options =
                new FirebaseRecyclerOptions.Builder<NewClass>()
                        .setQuery(mDatabase, NewClass.class)
                        .build();

        adapter = new Adapter(options);
        societyList.setAdapter(adapter);
    }

    @Override protected void onStart()
    {
        super.onStart();
        adapter.startListening();
    }

    @Override protected void onStop()
    {
        super.onStop();
        adapter.stopListening();
    }
}