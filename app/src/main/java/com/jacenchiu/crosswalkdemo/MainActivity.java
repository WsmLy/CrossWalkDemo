package com.jacenchiu.crosswalkdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickWebview(View view){
        Intent intent = new Intent();
        intent.setClass(this, WebViewActivity.class);
        startActivity(intent);
    }

    public void clickX5(View view){
        Intent intent = new Intent();
        intent.setClass(this, WebViewActivity.class);
        startActivity(intent);
    }

    public void clickCrosswalk(View view){
        Intent intent = new Intent();
        intent.setClass(this, CrosswalkActivity.class);
        startActivity(intent);
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
