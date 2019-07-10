package com.example.pertemuan7b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText InputNama;
    TextView TampilNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputNama = findViewById(R.id.EInput);
        TampilNama = findViewById(R.id.ETampil);
    }

    public void TampilNama(View v) {
        TampilNama.setText("Nama Anda Adalah : " + InputNama.getText());
    }
}
