package com.sru.m1itc20_s1.fragments_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sru.m1itc20_s1.BaActi;
import com.sru.m1itc20_s1.R;

public class Minfragment extends BaActi {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minfragment);
    }


    public void toViewPager(View view) {
        startActivity(new Intent(this, ViePger.class));
    }
}
