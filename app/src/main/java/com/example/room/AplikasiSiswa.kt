package com.example.room
import android.app.Application
import com.example.room.repositori.ContainerApp
import com.example.room.repositori.ContainerDataApp

class plikasiSiswa : Application() {
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}