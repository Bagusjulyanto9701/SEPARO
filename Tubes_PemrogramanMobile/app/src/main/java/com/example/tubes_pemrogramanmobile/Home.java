package com.example.tubes_pemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    public void clickpesanParkir(View view) {

        Intent intent = new Intent(Home.this, PesanParkir.class);
        startActivity(intent);

    }

    public void clickcekslotParkir(View view) {
        Intent intent = new Intent(Home.this, CekSlotParkir.class);
        startActivity(intent);

    }

    public void clickriwayatTransaksi(View view) {
        Intent intent = new Intent(Home.this, RiwayatTransaksi.class);
        startActivity(intent);

    }

    public void clickinfoAkun(View view) {
        Intent intent = new Intent(Home.this, InfoAkun.class);
        startActivity(intent);

    }
}