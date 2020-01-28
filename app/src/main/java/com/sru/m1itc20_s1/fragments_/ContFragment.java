package com.sru.m1itc20_s1.fragments_;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ContFragment extends FragmentPagerAdapter {

    private ArrayList<Fragment> ls = new ArrayList<>();
    private ArrayList<String >t = new ArrayList<>();
    public ContFragment(FragmentManager fm, ArrayList<Fragment> ls,ArrayList<String> t) {
        super(fm);
        this.ls = ls;
        this.t = t;
    }

    @Override
    public Fragment getItem(int position) {

        return ls.isEmpty() ? null : ls.get(position);

        //return null;
    }

    @Override
    public int getCount() {

        return ls.isEmpty() ? 0 : ls.size();
        //return 0;
    }
    //---set Title bar ---

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return t.isEmpty() ? "": t.get(position);
    }
}
