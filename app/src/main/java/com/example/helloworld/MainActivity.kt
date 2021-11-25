package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutid = findViewById<ConstraintLayout>(R.id.mainForid)
        Snackbar.make(layoutid,"HELLO, WELCOME TO MY APP :)",Snackbar.LENGTH_LONG).show()

        Log.i("MainActivity", "On Create")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "On Start")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "On Pause")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "On Resume")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "On Destroy")
    }
}