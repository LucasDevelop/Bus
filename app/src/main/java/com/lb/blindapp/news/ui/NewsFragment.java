package com.lb.blindapp.news.ui;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.lb.blindapp.R;
import com.lb.blindapp.base.fragment.BaseFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Author：lucas on 2016/8/18 16:26
 * Email：lucas_developer@163.com
 * Description：新闻页
 */
public class NewsFragment extends BaseFragment {


    @InjectView(R.id.list)
    RecyclerView mList;

    @Override
    protected View initView(Bundle savedInstanceState) {
        View rootView = View.inflate(getActivity(), R.layout.fragment_news, null);
        ButterKnife.inject(this, rootView);
        return rootView;
    }

}
