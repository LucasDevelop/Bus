package com.lb.blindapp.base.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;
import javax.inject.Singleton;

/**
 * Author：lucas on 2016/8/18 15:53
 * Email：lucas_developer@163.com
 * Description：fragment作用域
 */
@Retention(RetentionPolicy.RUNTIME)
@Singleton
@Scope
public @interface FragmentScope {
}
