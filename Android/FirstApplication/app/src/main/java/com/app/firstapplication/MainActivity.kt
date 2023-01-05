package com.app.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    // Lifecycle method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout)

        Log.d("LIFECYCLE", "onCreate: called")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("LIFECYCLE", "onDestroy: called")

    }

    override fun onStart() {
        super.onStart()

        Log.d("LIFECYCLE", "onStart: called")

    }

    override fun onStop() {
        super.onStop()

        Log.d("LIFECYCLE", "onStop: called")
    }

    override fun onResume() {
        super.onResume()

        Log.d("LIFECYCLE", "onResume: called")

    }

    override fun onPause() {
        super.onPause()

        Log.d("LIFECYCLE", "onPause: called")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("LIFECYCLE", "onRestart: called")
    }

}