package com.example.moa;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> items;
    private ArrayList<String> itext = new ArrayList<String>();

    public VPAdapter(FragmentManager fm) {
        super(fm);
        items = new ArrayList<Fragment>();
        items.add(new Fragment1());
        items.add(new Fragment2());
        items.add(new Fragment3());
        items.add(new Fragment4());

        itext.add("음식");
        itext.add("물건");
        itext.add("OTT");
        itext.add("택시");
    }

    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
