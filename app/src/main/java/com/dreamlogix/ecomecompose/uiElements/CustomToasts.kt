package com.dreamlogix.ecomecompose.uiElements

import android.content.Context
import android.widget.Toast

class CustomToasts {
    fun mToast(context: Context){
        Toast.makeText(context,"Toast", Toast.LENGTH_LONG).show()
    }
}