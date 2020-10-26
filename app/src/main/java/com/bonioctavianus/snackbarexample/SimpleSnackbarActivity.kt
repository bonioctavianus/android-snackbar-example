package com.bonioctavianus.snackbarexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_simple_snackbar.*

class SimpleSnackbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_snackbar)

        btn_show_snackbar.setOnClickListener {
            Snackbar.make(root_container, "Snackbar Message", Snackbar.LENGTH_SHORT).show()
        }
    }
}