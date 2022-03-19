package com.guko.assigment3

import android.app.UiModeManager
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var state = 0
    private var uiModeManager: UiModeManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    //depreciating function
    fun minus(view: View){
        state--
        val textView = findViewById<TextView>(R.id.tvState)
        textView.text = state.toString()

    }
    //value enhancing function
    fun plus(view: View){
        state++
        val textView = findViewById<TextView>(R.id.tvState)
        textView.text = state.toString()
    }
    //reset function
    fun reset(view:View){
        val textView = findViewById<TextView>(R.id.tvState)
        textView.text = "0"
        state = 0
        Toast.makeText(this, "value reset successfully", Toast.LENGTH_SHORT).show()
    }


}