package com.example.test;

import android.util.Log;

import com.example.app1.MainActivity;

/**
 * Create by lizhen on 2018/10/9
 */
public class InstrumentedActivity extends MainActivity {
    public static String TAG = "IntrumentedActivity";
    private FinishListener mListener;
    public void setFinishListener(FinishListener listener) {
        mListener = listener;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG + ".InstrumentedActivity", "onDestroy()");
        super.finish();
        if (mListener != null) {
            mListener.onActivityFinished();
        }
    }
}
