package com.example.homework05_month03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_ct,new ListFragment()).addToBackStack(null).commit();
       // getSupportFragmentManager().beginTransaction().replace(R.id.details_fl,new DetailsFragment()).addToBackStack(null).commit();
    }
}