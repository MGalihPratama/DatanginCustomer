package com.example.datangin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DaftarCustomer extends AppCompatActivity {
    Button daftar;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_customer);
        daftar = findViewById(R.id.btn_daftar);
        back = findViewById(R.id.btn_back_daftar);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVerifikasi();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToLogin();
            }
        });
    }
    public void openVerifikasi(){
        Intent intent = new Intent (this, VerifikasiCustomer.class);
        startActivity(intent);
    }
    public void backToLogin(){
        Intent intent = new Intent (this, LoginCustomer.class);
        startActivity(intent);
    }
}