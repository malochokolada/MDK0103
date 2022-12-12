package com.example.informationandreferencesystemarchitectualstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        var architectualStylesButton = findViewById<Button>(R.id.button)
        var tests = findViewById<Button>(R.id.button3)
    }
    
    fun architectualStyles(view: View){
       val intent = Intent (this@MenuActivity,HomeActivity::class.java)
        startActivity(intent)
    }


    fun tests (view: View){
        val intent = Intent (this@MenuActivity,MenuTest::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean{
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.night_theme -> {
                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES)
                else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
            }
            R.id.day_theme -> {
                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES)
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }

            R.id.about_program -> {
                val intent: Intent = Intent(this@MenuActivity,AboutProgramActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun activityAboutProgram(view: View) {
        val menuPro: MenuItem = findViewById(R.id.about_program)
        if (menuPro.isChecked) {
            val intent: Intent = Intent(this@MenuActivity, AboutProgramActivity::class.java)
            startActivity(intent)
        }
    }


}