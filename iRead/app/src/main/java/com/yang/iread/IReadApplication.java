package com.yang.iread;

import android.app.Application;
import com.squareup.leakcanary.LeakCanary;

/**
 * Description:
 * Data: 18-9-6 上午11:50
 *
 * @author: yang
 */
public class IReadApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }

}
