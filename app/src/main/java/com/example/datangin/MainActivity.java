package com.example.datangin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class  MainActivity extends AppCompatActivity {
    FrameLayout konten;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        konten = findViewById(R.id.konten);
        bottomNavigationView = findViewById(R.id.navigasi);
        buka_fragment(new HomeCustomerFragment());
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.beranda){
                    buka_fragment(new HomeCustomerFragment());
                    return true;
                }
                if(item.getItemId()==R.id.promo){
                    buka_fragment(new PromoCustomerFragment());
                    return true;
                }
                if(item.getItemId()==R.id.order){
                    buka_fragment(new OrderCustomerFragment());
                    return true;
                }
                if(item.getItemId()==R.id.transksi){
                    buka_fragment(new TransaksiCustomerFragment());
                    return true;
                }
                if(item.getItemId()==R.id.akun){
                    buka_fragment(new AkunCustomerFragment());
                    return true;
                }
                return false;
            }
        });
    }

    Boolean buka_fragment(Fragment fragment){
        if(fragment!=null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.konten, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}