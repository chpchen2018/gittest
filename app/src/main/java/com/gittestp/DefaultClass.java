package com.gittestp;

/**
 * Created by Administrator on 2017/3/22.
 */

 class DefaultClass {

    private static final DefaultClass ourInstance = new DefaultClass();

    public DefaultClass() {

    }

    public static DefaultClass getInstance() {
        return ourInstance;
    }


    public DefaultClass(String userName) {
        this.userName = userName;
    }

    String userName;
    public String getUserName() {
        if (userName != null) {
            return userName;
        }
        return "null";
    }
}
