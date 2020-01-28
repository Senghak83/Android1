package com.sru.m1itc20_s1.recy_frag;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PageAdaper extends FragmentPagerAdapter {

    private ArrayList<Fragment> ls = new ArrayList<>();
    private String []t;

    public PageAdaper(FragmentManager fm,ArrayList<Fragment> ls,String t[]) {

        super(fm);
        this.ls = ls;
        this.t = t;
    }

    @Override
    public Fragment getItem(int position) {
        return ls.isEmpty()? null : ls.get(position);
    }

    @Override
    public int getCount() {
        return ls.isEmpty()? 0 : ls.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return t[position];
    }
}
