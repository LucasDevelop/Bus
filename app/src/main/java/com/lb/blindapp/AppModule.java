package com.lb.blindapp;

import android.os.Handler;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * Author：lucas on 2016/8/18 15:25
 * Email：lucas_developer@163.com
 * Description：提供工具
 */
@Module
public class AppModule {
    private App mApp;

    public AppModule(App app) {
        mApp = app;
    }
    @Provides
    public App provideApp() {
        return mApp;
    }

    @Provides
    public Handler provideHandler(){
        return new Handler();
    }

    @Provides
    public Gson provideGson(){
        return new Gson();
    }

}
