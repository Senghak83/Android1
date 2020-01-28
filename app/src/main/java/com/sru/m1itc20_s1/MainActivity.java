package com.sru.m1itc20_s1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sru.m1itc20_s1.fragments_.Minfragment;
import com.sru.m1itc20_s1.recy_frag.frmRecyler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toMainFragment(View view) {
        startActivity(new Intent(this, Minfragment.class));
    }

    public void toRecycler(View view) {
        startActivity(new Intent(this, frmRecyler.class));
    }
}
