package com.tangcco.interview.view.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.tangcco.interview.R;
import com.tangcco.interview.utils.Util;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {




    //返回键
    private ActionBarDrawerToggle mDrawerToggle;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.dl_left)
    DrawerLayout dlLeft;
    @BindView(R.id.ll_tiku)
    LinearLayout llTiku;
    @BindView(R.id.ll_lianxi)
    LinearLayout llLianxi;
    @BindView(R.id.ll_shangchuan)
    LinearLayout llShangchuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
        initData();
        initListener();



    }

    public void initView() {


    }

    public void initData() {
        this.setToolbar();
    }

    public void initListener() {
        llLianxi.setOnClickListener(this);
        llTiku.setOnClickListener(this);
        llShangchuan.setOnClickListener(this);

    }

    private void setToolbar() {
        toolbar.setTitle("测试标题");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));

        setSupportActionBar(toolbar);
        //反射菜单项
        toolbar.inflateMenu(R.menu.menu_main);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch(item.getItemId()){
                    case R.id.action_search:
                        Util.mToast(MainActivity.this,"搜索功能为实现");
                        break;
                    case R.id.action_shequ:
                        Util.mToast(MainActivity.this,"社区功能为实现");
                        break;
                }
                return true;
            }
        });

        initDrawTaggle();

    }
    private void initDrawTaggle(){
        //创建返回键，并实现打开关/闭监听
        mDrawerToggle = new ActionBarDrawerToggle(this, dlLeft, toolbar,
                R.string.draw_open, R.string.draw_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        mDrawerToggle.syncState();
        dlLeft.setDrawerListener(mDrawerToggle);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            //练习
            case R.id.ll_lianxi:
                Util.mToast(this,"练习未实现");
                break;
            //上传
            case R.id.ll_shangchuan:
                Util.mToast(this,"上传未实现");
                break;
            //题库
            case R.id.ll_tiku:
                Util.mToast(this,"题库未实现");
                break;
        }


    }
}
