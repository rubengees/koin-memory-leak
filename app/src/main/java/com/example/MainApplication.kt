package com.example

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import org.koin.android.ext.android.startKoin

/**
 * @author Ruben Gees
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }

        LeakCanary.install(this)
        startKoin(this, listOf(mainModules))
    }
}
