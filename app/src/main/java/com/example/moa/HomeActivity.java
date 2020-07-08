package com.example.moa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3"} ;

    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU) ;
//
//        ListView listview = (ListView) findViewById(R.id.listview1) ;
//        listview.setAdapter(adapter) ;
//
//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            // 코드 계속 ...
//
//            @Override
//            public void onItemClick(AdapterView parent, View v, int position, long id) {
//
//                // get TextView's Text.
//                String strText = (String) parent.getItemAtPosition(position) ;
//
//                // TODO : use strText
//            }
//        }) ;
//    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ViewPager vp = findViewById(R.id.viewpager);
        VPAdapter adapter = new VPAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

        // 연동
        TabLayout tab = findViewById(R.id.tab);
        tab.setupWithViewPager(vp);


    }
}

