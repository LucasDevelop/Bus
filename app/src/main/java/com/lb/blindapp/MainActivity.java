package com.lb.blindapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.lb.blindapp.base.activity.BaseActivity;
import com.lb.blindapp.base.fragment.BaseFragment;
import com.lb.blindapp.bus.ui.BusFragment;
import com.lb.blindapp.news.ui.NewsFragment;
import com.lb.blindapp.weather.ui.WeatherFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends BaseActivity {

    @InjectView(R.id.tab_contain)
    TabLayout mTabContain;
    @InjectView(R.id.page)
    ViewPager mPage;

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        String[] titles = {"公交","新闻","天气"};
        BaseFragment[] fragments = {new BusFragment(),new NewsFragment(),new WeatherFragment()};
        for (String title : titles) {
            mTabContain.addTab(mTabContain.newTab().setText(title));
        }
        MainAdapter adapter = new MainAdapter(getSupportFragmentManager(), fragments,titles);
        mPage.setAdapter(adapter);
        mTabContain.setupWithViewPager(mPage);
    }

    class MainAdapter extends FragmentPagerAdapter{

        private BaseFragment[] mFragments;
        private String[] mTitles;

        public MainAdapter(FragmentManager fm, BaseFragment[] fragments, String[] titles) {
            super(fm);
            mFragments = fragments;
            mTitles = titles;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments[position];
        }

        @Override
        public int getCount() {
            return mFragments.length;
        }
    }

}
