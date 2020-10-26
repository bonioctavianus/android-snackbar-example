package com.bonioctavianus.snackbarexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_simple_snackbar.setOnClickListener {
            val intent = Intent(this, SimpleSnackbarActivity::class.java)
            startActivity(intent)
        }

        btn_advance_snackbar.setOnClickListener {
            val intent = Intent(this, AdvanceSnackbarActivity::class.java)
            startActivity(intent)
        }
    }
}