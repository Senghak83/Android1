package com.sru.m1itc20_s1.recy_frag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.sru.m1itc20_s1.BaActi;
import com.sru.m1itc20_s1.R;
import com.sru.m1itc20_s1.fragments_.fProduction;

import java.util.ArrayList;

public class frmRecyler extends BaActi {

    private ViewPager vp ;
    private String t[] ={"Production","Song","Singer",};
    private ArrayList<Fragment> ls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_recyler);

        //-------
        vp = findViewById(R.id.VPG);

        ls.add(new fProd());
        ls.add(new fSong());
        ls.add(new fSings());
        vp.setAdapter(new PageAdaper(getSupportFragmentManager(),ls,t));

    }

}
