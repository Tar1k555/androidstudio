package com.example.myapplication1

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class liveCycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_live_cycle)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Метод onStart викликано")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle","Метод onResume викликано")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle","Метод onPause викликано")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle","Метод onStop викликано")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle","Метод onDestroy викликано")
    }
}