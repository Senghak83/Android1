package com.sru.m1itc20_s1.Framents_Recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sru.m1itc20_s1.R;
import com.sru.m1itc20_s1.fragments_.ContFragment;

public class RyclerAdapter extends RecyclerView.Adapter <RyclerAdapter.SongHorlder> {

    private LayoutInflater infl ;
    public RyclerAdapter(Context con ){
        infl = LayoutInflater.from(con);
    }

    @NonNull
    @Override
    public SongHorlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v = infl.inflate(R.layout.songlist,parent,false);

        return new SongHorlder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull SongHorlder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    class SongHorlder extends RecyclerView.ViewHolder{

        public SongHorlder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
