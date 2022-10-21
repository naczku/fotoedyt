package com.example.myapplication

import android.graphics.BlendModeColorFilter
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat

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

        findViewById<SeekBar>(R.id.seekobr).setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                imageView.rotationY=(p1.toFloat())
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
//
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
//
            }
        })
        findViewById<SeekBar>(R.id.seekred).setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                imageView.colorFilter=BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                    Color.argb(p1,255,0,0),BlendModeCompat.SRC_ATOP
                )
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
//
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
//
            }
        })
        findViewById<SeekBar>(R.id.seekgreen).setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                imageView.colorFilter=BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                    Color.argb(p1,0,255,0),BlendModeCompat.SRC_ATOP
                )
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
//
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
//
            }
        })
        findViewById<SeekBar>(R.id.seekblue).setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                imageView.colorFilter=BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                    Color.argb(p1,0,0,255),BlendModeCompat.SRC_ATOP
                )
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