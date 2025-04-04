package com.jbms.testlibrary

import android.content.Context
import android.widget.Toast

/**
 * toast clss
 */
class ToastClass {
    companion object {
        /**
         * showToast
         * @param context
         * @param message
         */
        @JvmStatic
        fun showToast(context: Context, message:String) =
            Toast.makeText(context, "library core 1.2.3 - $message", Toast.LENGTH_SHORT).show()

    }
}