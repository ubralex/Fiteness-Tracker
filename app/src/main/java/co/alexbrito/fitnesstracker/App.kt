package co.alexbrito.fitnesstracker

import android.app.Application
import co.alexbrito.fitnesstracker.model.AppDatabase

class App : Application() {

    lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()
        db = AppDatabase.getDatabase(this)
    }
}