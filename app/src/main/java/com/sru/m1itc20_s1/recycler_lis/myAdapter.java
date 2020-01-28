package com.sru.m1itc20_s1.recycler_lis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sru.m1itc20_s1.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myHorder> {

    private Context con;
    private ArrayList<SongModel> ls = new ArrayList<>();

    public myAdapter(Context con , ArrayList<SongModel> ls){ this.con = con ; this.ls = ls; }





    @NonNull
    @Override
    public myHorder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_model,null,false);

        return new myHorder(v);

        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull myHorder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
