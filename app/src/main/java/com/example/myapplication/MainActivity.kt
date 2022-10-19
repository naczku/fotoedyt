package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekBar = findViewById<SeekBar>(R.id.przezrseek)
        val imageView = findViewById<ImageView>(R.id.obraz)
        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                imageView.setAlpha(p1)
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
//
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
//
            }
        })
    }
}