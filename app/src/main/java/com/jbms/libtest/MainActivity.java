package com.jbms.libtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jbms.testlibrary.ToastClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastClass.showToast(this, "aaaaaaaa");
    }
}