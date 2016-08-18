package com.lb.blindapp.base.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lb.blindapp.base.activity.UI;

/**
 * Author：lucas on 2016/8/18 16:26
 * Email：lucas_developer@163.com
 * Description：fragment基类
 */
public abstract class BaseFragment extends Fragment implements UI {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = initView(savedInstanceState);
        initData();
        return view;
    }

    protected abstract View initView(Bundle savedInstanceState);

    protected void initData() {
    }
}
