package com.lb.blindapp;

import com.lb.blindapp.data.api.module.ApiModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Author：lucas on 2016/8/18 15:27
 * Email：lucas_developer@163.com
 * Description：TODO
 */
@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
}
