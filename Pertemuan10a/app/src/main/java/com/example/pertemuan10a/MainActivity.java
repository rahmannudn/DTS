package com.example.pertemuan10a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {
    Button btnInternal, btnExternal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInternal = findViewById(R.id.btnInternal);
        btnExternal = findViewById(R.id.btnExternal);

    }

    public void Internal(View v){
        Intent intent = new Intent(MainActivity.this, InternalActivity.class);
        startActivity(intent);
    }

    public void External(View v){
        Intent intent = new Intent(MainActivity.this, ExternalActivity.class);
        startActivity(intent);
    }
}
