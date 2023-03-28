package com.barryzea.cleancodeapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.barryzea.cleancodeapp.R
import com.barryzea.cleancodeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

    }
}