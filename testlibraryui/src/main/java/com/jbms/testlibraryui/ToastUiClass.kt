package com.jbms.testlibraryui

import android.content.Context
import android.widget.Toast

class ToastUiClass {
    companion object {
        /**
         * showToast
         * @param context
         * @param message
         */
        @JvmStatic
        fun showToastUI(context: Context, message:String) =
            Toast.makeText(context, "library2 ui - $message", Toast.LENGTH_SHORT).show()

    }
}