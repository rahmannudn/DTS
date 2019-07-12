package com.example.pertemuan9a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.NavigableMap;

public class MainActivity extends AppCompatActivity {
    EditText Nama,Nim,Kampus;
    TextView HNim,HNama,HKampus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama = findViewById(R.id.eINama);
    Nim = findViewById(R.id.eINim);
    Kampus =  findViewById(R.id.eIKampus);
    HNim = findViewById(R.id.eIHNim);
    HNama = findViewById(R.id.eIHNama);
    HKampus = findViewById(R.id.eIHKampus);
    }
    public void Tampil (View v){

        HNama.setText("Nama Anda Adalah : " + Nama.getText());
        HNim.setText("Nim Anda Adalah : " + Nim.getText());
        HKampus.setText("Kampus Anda Adalah : " + Kampus.getText());
    }
}
