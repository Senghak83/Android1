package com.sru.m1itc20_s1.recy_frag;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sru.m1itc20_s1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fSong extends Fragment {

   private RecyclerView Rsong;

    public fSong() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vsong = inflater.inflate(R.layout.fragment_f_song3, container, false);

        Rsong = vsong.findViewById(R.id.RSONG);
        Rsong.setLayoutManager(new GridLayoutManager(getActivity(),6,GridLayoutManager.HORIZONTAL,false));
        Rsong.setAdapter(new MyAdapter(R.layout.song_model));

        return vsong;
    }

}
