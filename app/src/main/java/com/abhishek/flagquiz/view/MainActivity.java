package com.abhishek.flagquiz.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.abhishek.flagquiz.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        setContentView(R.layout.activity_main);
    }
}