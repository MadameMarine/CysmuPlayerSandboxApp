package com.umbral.www.cysmuplayersandboxapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.umbral.www.cysmuplayersandboxapp.R
import com.umbral.www.cysmuplayersandboxapp.databinding.ActivityMainBinding

/**
 * Hold the fragments for the Player and the Play Queue
 * */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Binding object for main activity
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )

    }
}
