package com.example.informationandreferencesystemarchitectualstyle

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatDelegate

class DetailActivity : AppCompatActivity(){
companion object{
    const val SELECTED_ITEM = "SELECTED_ITEM"
}
var selectedItem = "Не выбрано"
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
        finish()
        return
    }
    setContentView(R.layout.activity_detail)
    val extras: Bundle? = intent.extras
    selectedItem = extras?.getString(SELECTED_ITEM).toString()
}
override fun onResume() {
    super.onResume()
    val fragment: DetailFragment =
        supportFragmentManager.findFragmentById(R.id.detailFragment) as DetailFragment
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
        }
        return super.onOptionsItemSelected(item)
    }

    fun activityAboutProgram(view: View) {
        val menuPro: MenuItem = findViewById(R.id.about_program)
        if (menuPro.isChecked) {
            val intent: Intent = Intent(this@DetailActivity, AboutProgramActivity::class.java)
            startActivity(intent)
        }
    }

    /* override fun onSendData(selectedItem: String?) {
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
     }*/
 }

