package com.example.myapplication

import android.app.Application

class WaveApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val previous = Thread.getDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler(WaveExceptionHandler(previous))
    }
}
