package com.sru.m1itc20_s1.fragments_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.sru.m1itc20_s1.BaActi;
import com.sru.m1itc20_s1.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ViePger extends BaActi {

    private ViewPager vpg ;
    private ArrayList<Fragment> ls = new ArrayList<>();
    private ArrayList<String> title = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vie_pger);

        ls.add(new fProduction());
        ls.add(new fSinger());
        ls.add(new fSong());

        title.add("Production");
        title.add("Singer");
        title.add("Song");

        ContFragment contf = new ContFragment(getSupportFragmentManager(),ls,title);

        vpg = findViewById(R.id.vPg);
        vpg.setAdapter(contf);

    }
}
