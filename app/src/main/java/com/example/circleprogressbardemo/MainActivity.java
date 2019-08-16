package com.example.circleprogressbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CircleProgressBar fpmCircleProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fpmCircleProgressBar = findViewById(R.id.fpmCircleProgressBar);

        fpmCircleProgressBar.animationToProgress(90);

    }
}
