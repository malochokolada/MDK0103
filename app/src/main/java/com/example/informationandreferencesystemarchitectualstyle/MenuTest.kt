package com.example.informationandreferencesystemarchitectualstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_test)
    }

    fun goToFirstTest(view: View){
        val intent: Intent = Intent (this@MenuTest,ActivityFirstTest::class.java)
        startActivity(intent)
    }
}