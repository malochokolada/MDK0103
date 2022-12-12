package com.example.informationandreferencesystemarchitectualstyle

import android.app.AlertDialog
import android.app.Dialog
import android.content.res.Configuration
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.Window

class ActivityFirstTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        //requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_first_test)


        //Вызов диалогового окна
            /* val dialog = AlertDialog.Builder(this)
        dialog.requestWindowFeauture(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.previewdialog)
        dialog.getWindow().setBakgroundDrawable  */



    }


}

