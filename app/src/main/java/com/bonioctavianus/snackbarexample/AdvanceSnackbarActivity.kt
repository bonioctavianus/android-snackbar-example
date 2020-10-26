package com.bonioctavianus.snackbarexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_advance_snackbar.*

class AdvanceSnackbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advance_snackbar)

        btn_show_snackbar.setOnClickListener {
            Snackbar.make(root_container, "Snackbar Message", Snackbar.LENGTH_SHORT)
                .setTextColor(
                    ContextCompat.getColor(this, android.R.color.holo_red_light)
                )
                .setAction("Action") {
                    Log.d("Snackbar", "Action is selected")
                }
                .addCallback(object : BaseTransientBottomBar.BaseCallback<Snackbar>() {
                    override fun onShown(transientBottomBar: Snackbar?) {
                        super.onShown(transientBottomBar)
                        Log.d("Snackbar", "Snackbar is shown")
                    }

                    override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
                        super.onDismissed(transientBottomBar, event)
                        Log.d("Snackbar", "Snackbar is dismissed")
                    }
                })
                .show()
        }
    }
}