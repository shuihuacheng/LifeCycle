package com.leo.lifecycle.utils;

import android.util.Log;

public class LogUtil {
    private static final String APP_TAG = "LifeCycle";
    private static final String TAG_FORMAT = "%s-%s";

    public static void d(String tag, String log) {
            Log.d(String.format(TAG_FORMAT, APP_TAG, tag), log);
    }

    public static void e(String tag, String log) {
        Log.e(String.format(TAG_FORMAT, APP_TAG, tag), log);
    }

    public static void w(String tag, String log) {
        Log.w(String.format(TAG_FORMAT, APP_TAG, tag), log);
    }
    
    public static void i(String tag,String log){
    	Log.i(String.format(TAG_FORMAT, APP_TAG,tag),log);
    }
}
