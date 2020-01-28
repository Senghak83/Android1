package com.sru.m1itc20_s1.recy_frag;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sru.m1itc20_s1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fProd extends Fragment {

   private RecyclerView rproduct;

    public fProd() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment




        View vp =  inflater.inflate(R.layout.fragment_f_prod, container, false);
        this.rproduct = vp.findViewById(R.id.RCLPRODUC);
        rproduct.setLayoutManager(new LinearLayoutManager(getContext()));
        rproduct.setAdapter(new MyAdapter(R.layout.product_model));

        return vp;
    }


}
