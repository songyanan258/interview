package com.tangcco.interview.view.activity;

import android.support.v7.widget.Toolbar;

import com.tangcco.interview.R;
import com.tangcco.interview.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;


    @Override
    protected void initView() {
        mToolbar.setTitle("这里是标题");
        //mToolbar.setSubtitle("这里是子标题");
        mToolbar.setLogo(R.mipmap.ic_menu_black_36dp);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }
}
