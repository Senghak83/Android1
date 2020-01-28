package com.sru.m1itc20_s1.recycler_lis;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sru.m1itc20_s1.R;


public class myHorder extends RecyclerView.ViewHolder {

    // create object reference from list
    private TextView ti,des,sing;
    private ImageView ima;

    public myHorder(@NonNull View itemView) {

        super(itemView);
        ti = itemView.findViewById(R.id.title);
        des =itemView.findViewById(R.id.des);
        sing = itemView.findViewById(R.id.singer);
        ima = itemView.findViewById(R.id.imlist);


    }
}
