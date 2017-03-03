package com.tangcco.interview.view.activity;

import android.os.Bundle;

import com.tangcco.interview.R;
import com.tangcco.interview.base.BaseActivity;
import com.tangcco.interview.presenter.WelcomePresenter;
import com.tangcco.interview.presenter.impl.WelcomePresenterImpl;


public class WelcomeActivity extends BaseActivity {

    private WelcomePresenter presenter = new WelcomePresenterImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        /**
         * 向主持人发送消息
         * */
        presenter.getHandler().sendEmptyMessage(WelcomePresenter.TOMAINACTIVITY);
    }

    @Override
    protected void initListener() {

    }
}
