package com.sru.m1itc20_s1.fragments_;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sru.m1itc20_s1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fSinger extends Fragment {


    public fSinger() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f_singer, container, false);
    }

}
