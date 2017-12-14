package com.example.manuel.blankproject;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.manuel.blankproject.Fragments.Fragment1;
import com.example.manuel.blankproject.Fragments.Fragment2;
import com.example.manuel.blankproject.Fragments.Fragment3;

public class MainActivity extends AppCompatActivity {

    CustomViewPager customViewPager;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    customViewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    customViewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_notifications:
                    customViewPager.setCurrentItem(2);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);

        customViewPager = findViewById(R.id.viewpager);
        customViewPager.setSwipeable(false);

        setupViewPager(customViewPager);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        adapter.addFragment(fragment1);
        adapter.addFragment(fragment2);
        adapter.addFragment(fragment3);

        viewPager.setAdapter(adapter);
    }

}
