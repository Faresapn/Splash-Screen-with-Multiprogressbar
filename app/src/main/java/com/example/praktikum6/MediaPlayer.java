package com.example.praktikum6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MediaPlayer extends AppCompatActivity {
    ListView listView;
    String[] namaBuah = {
            "Alpukat",
            "Apel",
            "Ceri",
            "Durian",
            "Jambu Air",
            "Manggis",
            "Strawberry"
    };

    int[] gambarBuah = {
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry,
    };

    int[] suaraBuah = {
            R.raw.alpukat,
            R.raw.apel,
            R.raw.ceri,
            R.raw.durian,
            R.raw.jambuair,
            R.raw.manggis,
            R.raw.strawberry,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
        listView = findViewById(R.id.lv);


        //ArrayAdapter adapter = new ArrayAdapter (MainActivity.this, android.R.layout.simple_list_item_1, namaBuah);
        Adapter adapter = new Adapter(MediaPlayer.this, namaBuah, gambarBuah);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                android.media.MediaPlayer.create(MediaPlayer.this, suaraBuah[position]).start();

                Intent pindah = new Intent(MediaPlayer.this, DetailActivity.class);
                pindah.putExtra(Data.DATANAMA, namaBuah[position]);
                pindah.putExtra(Data.DATAGAMBAR, gambarBuah[position]);
                startActivity(pindah);
            }
        });
    }
}
