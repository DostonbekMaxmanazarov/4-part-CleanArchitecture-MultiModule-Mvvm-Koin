package uz.uzapexsoft.cleanarchitecture.presentation.application

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import uz.uzapexsoft.cleanarchitecture.presentation.di.appModule
import uz.uzapexsoft.cleanarchitecture.presentation.di.dataModule
import uz.uzapexsoft.cleanarchitecture.presentation.di.domainModule

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(appModule, domainModule, dataModule))
        }
    }
}