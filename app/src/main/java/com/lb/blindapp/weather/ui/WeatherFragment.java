package com.lb.blindapp.weather.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lb.blindapp.base.fragment.BaseFragment;

/**
 * Author：lucas on 2016/8/18 16:51
 * Email：lucas_developer@163.com
 * Description：天气
 */
public class WeatherFragment extends BaseFragment {
    @Override
    protected View initView(Bundle savedInstanceState) {
        TextView view = new TextView(getActivity());
        view.setText("天气");
        return view;
    }
}
