package com.example.pertemuan12b;

public class konfigurasi {
    public static final String URL_ADD="http://pegawai.terimajasa/tambahpgw.php";
    public static final String URL_GET_ALL = "http://pegawai.terimajasa/tampilsemuapgw.php";
    public static final String URL_GET_EMP = "http://pegawai.terimajasa/tampilpgw.php?id=";
    public static final String URL_UPDATE_EMP = "http://pegawai.terimajasa/updatepgw.php?id=";
    public static final String URL_DELETE_EMP = "http://pegawai.terimajasa/hapuspgw.php?id=";
    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "position"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_GAJIH = "salary"; //salary itu variabel untuk gajih
    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "position";//desg
    public static final String TAG_GAJIH = "salary";
    //ID karyawan
//emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
