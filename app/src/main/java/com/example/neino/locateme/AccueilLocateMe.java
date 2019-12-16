package com.example.neino.locateme;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

public class AccueilLocateMe extends AppCompatActivity {

    private static  int SPLASH_TIME_OUT = 2500;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_locate_me);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent locateIntent = new Intent(AccueilLocateMe.this,Locate.class);
                startActivity(locateIntent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}

