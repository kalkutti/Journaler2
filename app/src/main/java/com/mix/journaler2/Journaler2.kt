package com.mix.journaler2

import android.app.Application
import android.content.Context

class Journaler2 : Application() {
    companion object{
        var ctx: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        ctx = applicationContext
    }
}