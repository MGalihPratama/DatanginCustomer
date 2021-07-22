package com.example.datangin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginCustomer extends AppCompatActivity {
    Button masuk;
    TextView daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_customer);
        masuk = findViewById(R.id.btn_masuk);
        daftar = findViewById(R.id.daftar_disini);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
//                if(v.getId()==R.id.btn_masuk){
//                    getSupportFragmentManager().beginTransaction().replace(R.id.konten1, new HomeCustomerFragment()).commit();
//                }
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDaftar();
            }
        });

    }
    public void openMain(){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
    private void openDaftar(){
        Intent intent = new Intent (this, DaftarCustomer.class);
        startActivity(intent);
    }
}