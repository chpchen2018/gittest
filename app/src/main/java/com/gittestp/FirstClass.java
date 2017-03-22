package com.gittestp;

import android.util.Log;

/**
 * Created by Administrator on 2017/3/21.
 */

public class FirstClass {
    private static final String TAG = "FirstClass";

    /**
     * 说明33333333
     */


    private void testFunction(int age) {
        DefaultClass instance = DefaultClass.getInstance();
        String userName = instance.getUserName();
        Log.i(TAG, "testFunction: usernam:" + userName);
    }

}
