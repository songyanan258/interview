package com.tangcco.interview.view.activity;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tangcco.interview.R;
import com.tangcco.interview.utils.Util;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserDetailActivity extends AppCompatActivity {


    @BindView(R.id.coord_bottom)
    CoordinatorLayout coordBottom;
    @BindView(R.id.toolbar_detail)
    Toolbar toolbar;
    @BindView(R.id.toolbar_username)
    TextView toolbarUsername;
    @BindView(R.id.tv_num_fensi)
    TextView tvNumFensi;
    @BindView(R.id.userdetail_num_fensi)
    LinearLayout userdetailNumFensi;
    @BindView(R.id.tv_num_fatie)
    TextView tvNumFatie;
    @BindView(R.id.userdetail_num_fatie)
    LinearLayout userdetailNumFatie;
    @BindView(R.id.tv_num_guanzhu)
    TextView tvNumGuanzhu;
    @BindView(R.id.userdetail_ll_guanzhu)
    LinearLayout userdetailLlGuanzhu;
    @BindView(R.id.rl_head)
    RelativeLayout rlHead;
    @BindView(R.id.detail_iv_nicheng)
    ImageView detailIvNicheng;
    @BindView(R.id.detail_iv_sex)
    ImageView detailIvSex;
    @BindView(R.id.detail_iv_phoneNum)
    ImageView detailIvPhoneNum;
    @BindView(R.id.detail_iv_changePass)
    ImageView detailIvChangePass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        ButterKnife.bind(this);

        initView();
        initData();
        initListener();
    }

    private void initListener() {

    }

    private void initData() {

    }

    private void initView() {
        initToolbar();

    }

    private void initToolbar() {

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_chevron_left_white_36dp);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                Util.mSnack(this, coordBottom, "这是message", "这是action", "这是弹框");
                break;
        }
        return super.onOptionsItemSelected(item);

    }


}
