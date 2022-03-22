package com.srijan.instagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import Fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navView);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Instagram");
    }
}