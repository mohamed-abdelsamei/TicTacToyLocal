package com.c0d3r.tictactoylocal.tictactoylocal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View){
        val btnSelected = view as Button

        Toast.makeText(this,btnSelected.id.toString(), Toast.LENGTH_LONG).show()
    }
}
