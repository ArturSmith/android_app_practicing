package com.example.practicing_logs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainAct", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainAct", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainAct", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainAct", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainAct", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainAct", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainAct", "onDestroy")
    }


}