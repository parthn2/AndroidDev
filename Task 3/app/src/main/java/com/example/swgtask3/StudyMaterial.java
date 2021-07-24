package com.example.swgtask3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.swgtask3.ui.main.SectionsPagerAdapter;
import com.example.swgtask3.databinding.ChemistrySemesterBinding;

public class StudyMaterial extends AppCompatActivity {

    private ChemistrySemesterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ChemistrySemesterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
    }

    public void SwitchToPDS(View view) {
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/11p02_CZGmmPZOOVY0_MwiaeW89YbS4os?usp=sharing"));
        startActivity(launchBrowser);
    }

    public void SwitchToPDSLab(View view) {
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1yB95BJrYHYN-8ZwVXuJM25oNqmdGQxBq?usp=sharing"));
        startActivity(launchBrowser);
    }
    public void SwitchToBEM(View view) {
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1VCXHf244c-69fdJawiSB2yWqEz46xUQw?usp=sharing"));
        startActivity(launchBrowser);
    }

    public void SwitchToET(View view) {
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1O1hglgMRXRbVwfUaHJRhNSlGe4h-Yfiz?usp=sharing"));
        startActivity(launchBrowser);
    }
}