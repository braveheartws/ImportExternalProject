package com.havefun.mainproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.havefun.extlib.ExternalLibUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //引用本地外部模块都类
        ExternalLibUtil.hello();
    }
}