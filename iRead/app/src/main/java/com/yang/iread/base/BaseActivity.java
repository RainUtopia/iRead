package com.yang.iread.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Description:
 * Data: 18-9-6 上午11:36
 *
 * @author: yang
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseContract.View {
    @LayoutRes
    public abstract int loadLayout();

    public abstract void initView();

    public abstract void loadData();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(loadLayout());

        ButterKnife.bind(this);

        initView();
        loadData();
    }

    public void startActivity(Class<?> activity) {
        startActivity(new Intent(this,activity));
    }

    @Override
    public void handleError(String errMsg) {
        //setContentView();   //设置出现错误时候的布局
    }
}
