package com.example.informationandreferencesystemarchitectualstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatDelegate

class HomeActivity : AppCompatActivity(), ListOfStyles.OnFragmentSendDataListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onSendData(selectedItem: String?) {
        val fragment = supportFragmentManager
            .findFragmentById(R.id.detailFragment) as DetailFragment?
        if (fragment != null && fragment.isVisible){
        fragment?.setSelectedItem(selectedItem)
        }
        else{
            val intent = Intent(applicationContext,
                DetailActivity::class.java)
            intent.putExtra(DetailActivity.SELECTED_ITEM, selectedItem)
            startActivity(intent)
        }
        fragment?.setSelectedItem(selectedItem)
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
                val intent: Intent = Intent(this@HomeActivity,AboutProgramActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun activityAboutProgram(view: View) {
        val menuPro: MenuItem = findViewById(R.id.about_program)
        if (menuPro.isChecked) {
            val intent: Intent = Intent(this@HomeActivity, AboutProgramActivity::class.java)
            startActivity(intent)
        }
    }



    private fun Any.inflate(mainMenu: Int) {

    }


}

