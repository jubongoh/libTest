package com.jbms.testlibrary

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class LibTestActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libtest)
        var tv = findViewById<TextView>(R.id.tv_version)
        tv.text = "META-VER : ${BuildConfig.TESTLIB_SDK_VERSION}"
    }
}