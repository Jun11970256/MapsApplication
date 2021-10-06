package com.example.mapsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class MainMapsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_maps)
    }

    fun onGofukuBtnTapped(view: View?) {
        val intent = Intent(this, MapsGofukuActivity::class.java)
        startActivity(intent)
    }

    fun onSugitaniBtnTapped(view: View?) {
        val intent = Intent(this, MapsSugitaniActivity::class.java)
        startActivity(intent)
    }

    fun onTakaokaBtnTapped(view: View?) {
        val intent = Intent(this, MapsTakaokaActivity::class.java)
        startActivity(intent)
    }
}