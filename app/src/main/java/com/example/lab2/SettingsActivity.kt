package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SettingsActivity : AppCompatActivity() {

    companion object {
        const val ACTIVITY_TITLE = "Settings"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        Log.d("${ACTIVITY_TITLE}:Pasechnaya.Alina", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("${ACTIVITY_TITLE}:Pasechnaya.Alina", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("${ACTIVITY_TITLE}:Pasechnaya.Alina", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("${ACTIVITY_TITLE}:Pasechnaya.Alina", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("${ACTIVITY_TITLE}:Pasechnaya.Alina", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("${ACTIVITY_TITLE}:Pasechnaya.Alina", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("${ACTIVITY_TITLE}:Pasechnaya.Alina", "onRestart")
    }
}