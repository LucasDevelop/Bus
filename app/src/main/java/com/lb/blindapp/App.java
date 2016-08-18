package com.lb.blindapp;

import android.app.Application;

import com.lb.blindapp.data.api.module.ApiModule;

/**
 * Author：lucas on 2016/8/18 15:25
 * Email：lucas_developer@163.com
 * Description：程序入口
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        DaggerAppComponent.builder()
                .apiModule(new ApiModule())
                .appModule(new AppModule(this))
                .build();
    }
}
