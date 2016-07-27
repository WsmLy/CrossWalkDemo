package com.jacenchiu.crosswalkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.xwalk.core.XWalkView;

public class MainActivity extends AppCompatActivity {

    private XWalkView mXWalkWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mXWalkWebView = (XWalkView) findViewById(R.id.xwv_content);
        mXWalkWebView.load("http://html5test.com/", null);

        // turn on debugging
        //XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mXWalkWebView != null) {
            mXWalkWebView.pauseTimers();
            mXWalkWebView.onHide();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mXWalkWebView != null) {
            mXWalkWebView.resumeTimers();
            mXWalkWebView.onShow();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mXWalkWebView != null) {
            mXWalkWebView.onDestroy();
        }
    }
}
