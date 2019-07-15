package com.example.pertemuan10a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class InternalActivity extends AppCompatActivity {
    public static final String FILENAME = "nama_file.txt";
    Button Tambah,Ubah,Baca,Hapus;
    TextView txtBaca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal);
        Tambah = findViewById(R.id.btnTambah);
        Ubah = findViewById(R.id.btnUbah);
        Baca = findViewById(R.id.btnBaca);
        Hapus = findViewById(R.id.btnHapus);
        txtBaca = findViewById(R.id.txtBaca);

    }
    public void Tambah(View v){
        String isiFile = "Coba isi data file Text";
        File file = new File(getFilesDir(), FILENAME);

        FileOutputStream outputStream = null;
        try{
            file.createNewFile();
            outputStream = new FileOutputStream(file, true);
            outputStream.write(isiFile.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void Ubah(View v){
        String ubah = "Update data file Text";

        File file = new File(getFilesDir(), FILENAME);

        FileOutputStream outputStream = null;
        try{
            file.createNewFile();
            outputStream = new FileOutputStream(file, false);
            outputStream.write(ubah.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void Baca(View v){
        File sdcard= getFilesDir();
        File file = new File(sdcard, FILENAME);

        if(file.exists()){
            StringBuilder text = new  StringBuilder();

            try{
                BufferedReader br = new BufferedReader(new FileReader(file));

                String line = br.readLine();

                while(line != null){
                    text.append(line);
                    line = br.readLine();
                }
                br.close();
            } catch (IOException e){
                System.out.println("Error "+ e.getMessage());
            }
            txtBaca.setText(text.toString());
        }
    }

    public void Hapus(View v){
        File file = new File(getFilesDir(),FILENAME);
        if(file.exists()){
            file.delete();
        }
    }
}
