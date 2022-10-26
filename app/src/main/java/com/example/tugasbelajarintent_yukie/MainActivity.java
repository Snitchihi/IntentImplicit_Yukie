package com.example.tugasbelajarintent_yukie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String KONTAK = "NAMA" ;
    private TextView PENERIMA ;
    public static final int TEXT_REQUEST=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pageSteven(View view) {
        Intent page = new Intent(MainActivity.this, HalamanKirim.class);
        page.putExtra(KONTAK, "Steven");
        startActivity(page);
    }

    public void pageOlive(View view) {
        Intent page = new Intent(MainActivity.this, HalamanKirim.class);
        page.putExtra(KONTAK, "Olive");
        startActivity(page);
    }

    public void pageJuan(View view) {
        Intent page1 = new Intent(MainActivity.this, HalamanKirim.class);
        page1.putExtra(KONTAK, "Juan");
        startActivity(page1);
    }
}