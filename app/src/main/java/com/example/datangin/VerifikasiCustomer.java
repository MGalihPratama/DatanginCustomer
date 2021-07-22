package com.example.datangin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VerifikasiCustomer extends AppCompatActivity {
    ImageButton back;
    Button verif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifikasi_customer);
        back = findViewById(R.id.btn_back_verifikasi);
        verif = findViewById(R.id.btn_verifikasi);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToDaftar();
            }
        });
        verif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });
    }
    public void backToDaftar(){
        Intent intent = new Intent (this, DaftarCustomer.class);
        startActivity(intent);
    }
    public void openMain(){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}