package com.gittestp;

import android.util.Log;

import com.gittestp.mvpview.BasePresenter;

/**
 * Created by Administrator on 2017/3/21.
 */

public class FirstClass extends BasePresenter {
    private static final String TAG = "FirstClass";

    @Override
    protected void overrideTest() {
        super.overrideTest();
        Log.i(TAG, "overrideTest: child");

    }

    /**
     * 说明33333333
     */

        

    private void testFunction(int age) {
        DefaultClass instance = DefaultClass.getInstance();
        String userName = instance.getUserName();
        Log.i(TAG, "testFunction: usernam:" + userName);
    }

    @Override
    protected void initPresenter() {
        
    }
}
