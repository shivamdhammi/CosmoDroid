package com.example.baseui.room

import android.annotation.SuppressLint
import android.app.Application
import android.content.ContextWrapper

@SuppressLint("StaticFieldLeak")
object BaseUI {
    lateinit var mApp: Application
    lateinit var mContextWrapper: ContextWrapper
    fun initialized(app: Application) {
        mApp = app
        mContextWrapper = ContextWrapper(app.baseContext)
    }
}