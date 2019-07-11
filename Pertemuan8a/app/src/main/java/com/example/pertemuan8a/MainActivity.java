package com.example.pertemuan8a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText InputPertama,InputKedua;
    TextView lblHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputPertama = findViewById(R.id.eInput1);
        InputKedua = findViewById(R.id.eInput2);
        lblHasil = findViewById(R.id.eHasil);
//        Tambah = findViewById(R.id.btnTambah);
//        Kurang = findViewById(R.id.btnKurang);
//        Bagi = findViewById(R.id.btnBagi);
//        Kali = findViewById(R.id.btnKali);
//        Clear = findViewById(R.id.btnClear);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public void TampilTambah(View v) {
        if (InputPertama.getText().length() > 0 && InputKedua.getText().length() > 0) {
            int input1 = Integer.parseInt(InputPertama.getText().toString());
            int input2 = Integer.parseInt(InputKedua.getText().toString());
            int hasil = input1 + input2;
            lblHasil.setText(Integer.toString(hasil));
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan ", Toast.LENGTH_LONG);
            toast.show();
        }
    }

        public void TampilKurang (View v) {
            if (InputPertama.getText().length() > 0 && InputKedua.getText().length() > 0) {
                int input1 = Integer.parseInt(InputPertama.getText().toString());
                int input2 = Integer.parseInt(InputKedua.getText().toString());
                int hasil = input1 - input2;
                lblHasil.setText(Integer.toString(hasil));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan ", Toast.LENGTH_LONG);
                toast.show();
            }
        }
            public void TampilBagi(View v) {
            if (InputPertama.getText().length() > 0 && InputKedua.getText().length() > 0) {
                int input1 = Integer.parseInt(InputPertama.getText().toString());
                int input2 = Integer.parseInt(InputKedua.getText().toString());
                int hasil = input1 / input2;
                lblHasil.setText(Integer.toString(hasil));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan ", Toast.LENGTH_LONG);
                toast.show();
            }
            }
                public void TampilKali(View v){
                if (InputPertama.getText().length() > 0 && InputKedua.getText().length() > 0) {
                    int input1 = Integer.parseInt(InputPertama.getText().toString());
                    int input2 = Integer.parseInt(InputKedua.getText().toString());
                    int hasil = input1 * input2;
                    lblHasil.setText(Integer.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan ", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
    public void Bersihkan(View v){
        InputPertama.setText("");
        InputKedua.setText("");
        lblHasil.setText("");
        }
    }