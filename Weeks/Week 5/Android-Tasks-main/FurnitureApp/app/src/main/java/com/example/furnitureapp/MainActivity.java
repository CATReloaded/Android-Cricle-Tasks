package com.example.furnitureapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    CategoryFragment categoryFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        openCategoryFragment();

    }
    public void openCategoryFragment(){
        categoryFragment=CategoryFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,categoryFragment).commit();
    }


}