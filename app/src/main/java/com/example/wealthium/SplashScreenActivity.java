package com.example.wealthium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreenActivity extends AppCompatActivity {

    LottieAnimationView splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);

        splash = findViewById(R.id.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        },4000);

    }
}