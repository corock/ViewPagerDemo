package com.example.viewpagerindicator;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    ArrayList arrayList; // viewPager에서 보여줄 item

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(R.drawable.ad1 + i);
        }

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPagerAdapter = new ViewPagerAdapter(getLayoutInflater(), arrayList);
        viewPager.setAdapter(viewPagerAdapter);
    }

}