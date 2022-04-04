package com.example.cosmodroid

import android.app.Application
import com.example.baseui.room.BaseUI

class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        BaseUI.initialized(this)
    }
}