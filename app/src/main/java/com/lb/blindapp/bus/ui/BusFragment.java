package com.lb.blindapp.bus.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lb.blindapp.R;
import com.lb.blindapp.base.fragment.BaseFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Author：lucas on 2016/8/18 16:50
 * Email：lucas_developer@163.com
 * Description 巴士
 */
public class BusFragment extends BaseFragment {
    @InjectView(R.id.station)
    TextView mStation;
    @InjectView(R.id.search)
    ImageView mSearch;
    @InjectView(R.id.in)
    TextView mIn;
    @InjectView(R.id.to)
    TextView mTo;
    @InjectView(R.id.station_img_1)
    ImageView mStationImg1;
    @InjectView(R.id.station_text_1)
    TextView mStationText1;
    @InjectView(R.id.station_img_2)
    ImageView mStationImg2;
    @InjectView(R.id.station_text_2)
    TextView mStationText2;
    @InjectView(R.id.station_img_3)
    ImageView mStationImg3;
    @InjectView(R.id.station_text_3)
    TextView mStationText3;
    @InjectView(R.id.station_img_4)
    ImageView mStationImg4;
    @InjectView(R.id.station_text_4)
    TextView mStationText4;
    @InjectView(R.id.station_img_5)
    ImageView mStationImg5;
    @InjectView(R.id.station_text_5)
    TextView mStationText5;
    @InjectView(R.id.first_train)
    TextView mFirstTrain;
    @InjectView(R.id.last_train)
    TextView mLastTrain;
    @InjectView(R.id.ticket_price)
    TextView mTicketPrice;

    @Override
    protected View initView(Bundle savedInstanceState) {
        View rootView = View.inflate(getActivity(), R.layout.fragment_bus, null);
        ButterKnife.inject(this, rootView);
        return rootView;
    }

}
