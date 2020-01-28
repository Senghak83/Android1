package com.sru.m1itc20_s1.recy_frag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sru.m1itc20_s1.R;

public class MyAdapter extends RecyclerView.Adapter<MyHorder> {
    private LayoutInflater inf;
    int layout ;

    public MyAdapter(int layout){
       this.layout = layout;
    }

    @NonNull
    @Override
    public MyHorder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        inf = LayoutInflater.from(parent.getContext());
        View v = inf.inflate(layout,parent,false);

        return new MyHorder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyHorder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
