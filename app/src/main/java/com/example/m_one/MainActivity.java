package com.example.m_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_intro);

        Thread t = new Thread(() -> {

            try {

                Thread.sleep(2000);
                Intent intent = new Intent(getApplicationContext(), loginAcivity.class);
                startActivity(intent);

            } catch (Exception e) {
                Log.d("TAG", e.getMessage());
            }
        });
        t.start();


    }
}