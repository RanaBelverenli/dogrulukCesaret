package com.example.dogrulukcesaret

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Splash screen'i belirli bir süre (örneğin 2 saniye) göstermek için handler kullan
        Handler(Looper.getMainLooper()).postDelayed({
            // Ana aktiviteye geçiş yap
            startActivity(Intent(this, MainActivity::class.java))
            finish()  // Splash activity'i kapat
        }, 2000)  // 2000 milisaniye = 2 saniye
    }
}
