package com.jbms.testlibrary

import android.content.Context
import android.widget.Toast

class ToastClass {
    companion object {
        @JvmStatic
        fun showToast(context: Context, message:String) = Toast.makeText(context, message, Toast.LENGTH_SHORT).show()



    }
}