package com.gittestp;

/**
 * Created on 2017/3/23.
 *
 * @author chenchengpei@cheyipai.com
 */

public class InstanceT {
    private static final InstanceT ourInstance = new InstanceT();

    public static InstanceT getInstance() {
        return ourInstance;
    }

    private InstanceT() {
    }
}
