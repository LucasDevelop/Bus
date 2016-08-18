package com.lb.blindapp.base.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;
import javax.inject.Singleton;

/**
 * Author：lucas on 2016/8/18 15:51
 * Email：lucas_developer@163.com
 * Description：activity作用域
 */
@Singleton
@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface ActivityScope {
}
