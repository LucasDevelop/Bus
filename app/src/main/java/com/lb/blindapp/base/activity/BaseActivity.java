package com.lb.blindapp.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Author：lucas on 2016/8/18 16:01
 * Email：lucas_developer@163.com
 * Description：activity基类
 */
public abstract class BaseActivity extends AppCompatActivity implements UI{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView(savedInstanceState);
        initData(savedInstanceState);
    }

    protected abstract void initView(Bundle savedInstanceState);

    protected void initData(Bundle savedInstanceState) {
    }

}
