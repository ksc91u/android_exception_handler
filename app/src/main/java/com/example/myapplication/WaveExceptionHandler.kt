package com.example.myapplication

import android.os.Handler
import android.os.Looper

class WaveExceptionHandler(private val previous: Thread.UncaughtExceptionHandler) :
    Thread.UncaughtExceptionHandler {

    //private val handler = Handler(Looper.getMainLooper())

    override fun uncaughtException(t: Thread?, e: Throwable?) {
        if (e is Exception) {
            println(">>>> 2")
            println(">>>> 3")
            println(">>>> 4")
        } else if (e is CancelException) {
        } else {
            println(">>>> kill, previous $previous")
            println(">>>> 7")
            previous.uncaughtException(t, e)
            println(">>>> 8")
        }
    }
}

class CancelException : Exception() {
    override val message: String?
        get() = "Canceled"
}