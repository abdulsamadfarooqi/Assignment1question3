package com.example.samad.assignment1question3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class LauncherActivity extends AppCompatActivity {
    private static int timeOut=5000;    //time set for splash screen


    @Override
    protected void onCreate(Bundle savedInstanceState) {    //On creation of activity this function will be called
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);         //uses activity_launcher layout file
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {                    //handler for delay
                Intent launcherIntent= new Intent(LauncherActivity.this,LoginActivity.class);// Intent to goto desired activity
                startActivity(launcherIntent);
                finish();
            }
        },timeOut);             //Time out


    }
}
