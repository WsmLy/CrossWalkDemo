package com.jacenchiu.crosswalkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * @author QiuJiexuan
 * @version 1.0 2016年07月27日 19:49
 */
public class WebViewActivity extends AppCompatActivity {

    private WebView mWebView;

    private WebSettings mWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        setTitle("WebViewDemo");

        mWebView = (WebView) findViewById(R.id.wv_content);
        mWebView.loadUrl("http://html5test.com/");
        mWebSettings = mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
