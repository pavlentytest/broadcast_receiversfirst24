package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val airFlag = intent.getBooleanExtra("state",false)
        if(airFlag) {
            Toast.makeText(context,"Airmode is true!",Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context,"Airmode is false!",Toast.LENGTH_LONG).show()
        }
    }
}