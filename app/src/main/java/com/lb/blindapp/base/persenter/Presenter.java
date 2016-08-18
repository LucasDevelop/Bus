package com.lb.blindapp.base.persenter;

import com.lb.blindapp.base.activity.UI;

/**
 * Author：lucas on 2016/8/18 16:11
 * Email：lucas_developer@163.com
 * Description：对ui解耦
 */
public interface Presenter<U> {
    void attach(U ui);
    void detach();
}
