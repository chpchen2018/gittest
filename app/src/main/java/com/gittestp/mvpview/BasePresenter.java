package com.gittestp.mvpview;

import android.util.Log;

/**
 * Created by Administrator on 2017/3/22.
 */

public abstract class BasePresenter {
    private static final String TAG = "BasePresenter";
    private String userName;

    public BasePresenter() {

        Log.i(TAG, "BasePresenter: ");
    }

    protected void overrideTest() {
        Log.i(TAG, "overrideTest: Parent");
    }

    protected abstract void initPresenter();
    private void  test() {

        String str = "temple";
        if (str != null) {
            
        }
    }
}
