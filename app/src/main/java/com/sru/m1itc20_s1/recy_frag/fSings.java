package com.sru.m1itc20_s1.recy_frag;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sru.m1itc20_s1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fSings extends Fragment {

   private RecyclerView rcy;

    public fSings() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View v =  inflater.inflate(R.layout.fragment_f_sings, container, false);
        rcy = v.findViewById(R.id.RecSinger);

        //GridLayoutManager gla = new GridLayoutManager(getActivity(),2,GridLayoutManager.HORIZONTAL,false);
        rcy.setLayoutManager(new LinearLayoutManager(getContext()));
        //rcy.setLayoutManager(new GridLayoutManager(getActivity(),3,GridLayoutManager.HORIZONTAL,false));
        rcy.setAdapter(new MyAdapter(R.layout.sing_model));


        return v;
    }

}
