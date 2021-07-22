package com.example.datangin;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class HomeCustomerFragment extends Fragment {
    ImageButton pickup, delivery, membership;
    RelativeLayout header;
    Button notifikasi;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_customer, container, false);
        pickup = view.findViewById(R.id.btn_pickup);
        delivery = view.findViewById(R.id.btn_delivery);
        membership = view.findViewById(R.id.btn_membership);
        header = view.findViewById(R.id.header_home);
        notifikasi = view.findViewById(R.id.btn_notifikasi);

        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getActivity(), PointCustomer.class);
                startActivity(intent);
            }
        });
        pickup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderCustomerFragment orderCustomerFragment = new OrderCustomerFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.konten, orderCustomerFragment);
                transaction.commit();
            }

        });
        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderDeliveryCustomer orderDeliveryCustomer = new OrderDeliveryCustomer();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.konten, orderDeliveryCustomer);
                transaction.commit();
            }
        });

        membership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MembershipCustomer membershipCustomer = new MembershipCustomer();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.konten, membershipCustomer);
                transaction.commit();
            }
        });

        notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getActivity(), CustomerNotifikasi.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
