package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    companion object {
        const val ACTIVITY_TITLE = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settingsButton = findViewById<Button>(R.id.settings_button)
        settingsButton.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        val aboutButton = findViewById<Button>(R.id.about_button)
        aboutButton.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        Log.d("$ACTIVITY_TITLE:Pasechnaya.Alina", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("$ACTIVITY_TITLE:Pasechnaya.Alina", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("$ACTIVITY_TITLE:Pasechnaya.Alina", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("$ACTIVITY_TITLE:Pasechnaya.Alina", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("$ACTIVITY_TITLE:Pasechnaya.Alina", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("$ACTIVITY_TITLE:Pasechnaya.Alina", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("$ACTIVITY_TITLE:Pasechnaya.Alina", "onRestart")
    }
}