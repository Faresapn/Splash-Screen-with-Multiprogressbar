package com.example.praktikum6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tvnamaBuah;
    ImageView ivgambarBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String namabuah = getIntent().getStringExtra(Data.DATANAMA);
        int gambarbuah = getIntent().getIntExtra(Data.DATAGAMBAR, 0);


        tvnamaBuah = findViewById(R.id. tv_detail_nama);
        ivgambarBuah = findViewById(R.id.iv_detail_gambar);

        tvnamaBuah.setText(namabuah);
        ivgambarBuah.setImageResource(gambarbuah);
    }
}
