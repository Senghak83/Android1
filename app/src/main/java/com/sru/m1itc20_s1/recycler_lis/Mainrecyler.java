package com.sru.m1itc20_s1.recycler_lis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sru.m1itc20_s1.R;

import java.util.ArrayList;

public class Mainrecyler extends AppCompatActivity {

    private RecyclerView rcl;
    private ArrayList<SongModel> ls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainrecyler);



        //---------
        rcl = findViewById(R.id.RCL);
        ls.add(new SongModel("ABC","Romatic",1));
        ls.add(new SongModel("Go","Hip",2));
        myAdapter mya = new myAdapter(this,ls);

        rcl.setAdapter(mya);

    }
}
