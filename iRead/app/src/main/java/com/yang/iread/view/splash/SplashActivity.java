package com.yang.iread.view.splash;

import android.os.Handler;

import com.yang.iread.view.home.HomeActivity;
import com.yang.iread.R;
import com.yang.iread.base.BaseActivity;

/**
 * Description:
 * Data: 18-9-6 上午11:36
 *
 * @author: yang
 */
public class SplashActivity extends BaseActivity {
    private Handler mHandler;

    @Override
    public int loadLayout() {
        return R.layout.activity_splash;
    }

    @Override
    public void initView() {
    }

    @Override
    public void loadData() {
        mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(HomeActivity.class);
                finish();
            }
        },2000);
    }
}
