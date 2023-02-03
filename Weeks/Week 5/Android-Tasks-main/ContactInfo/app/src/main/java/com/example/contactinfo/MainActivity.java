package com.example.contactinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timer timer = new Timer();
        SharedPreferences sp = getSharedPreferences("installedApp", MODE_PRIVATE);
        String key = "first_time";
        String value="";
        String first_time = sp.getString(key,"");

        if (!first_time.equals("yes")) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent = new Intent(getApplicationContext(), ContactNameActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, 1000);
        }
        else{
            SharedPreferences.Editor editor = sp.edit();
            value="no";
            editor.putString(key,value);
            editor.apply();
        }
    }
}