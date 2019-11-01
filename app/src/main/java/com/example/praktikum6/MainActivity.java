package com.example.praktikum6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.aseem.versatileprogressbar.ProgBar;

public class MainActivity extends AppCompatActivity {
    private ProgBar progBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progBar = findViewById(R.id.myProgBar);
        progBar.enlarge(4);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pindah = new Intent(MainActivity.this, MediaPlayer.class);
                startActivity(pindah);
                finish();
            }
        },  2000);
    }
}
