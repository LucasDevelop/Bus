package com.lb.blindapp.base.persenter;

import com.lb.blindapp.base.activity.UI;

/**
 * Author：lucas on 2016/8/18 16:16
 * Email：lucas_developer@163.com
 * Description：对ui解耦
 */
public class BasePresenter<U extends UI> implements Presenter<U> {
    private U mUi;

    @Override
    public void attach(U ui) {
        mUi = ui;
    }

    @Override
    public void detach() {
        mUi = null;
    }
}
