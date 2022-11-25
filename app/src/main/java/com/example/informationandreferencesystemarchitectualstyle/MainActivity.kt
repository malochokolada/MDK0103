package com.example.informationandreferencesystemarchitectualstyle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        var videoView = findViewById<VideoView>(R.id.videoView)
        videoView!!.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.s))
        videoView!!.requestFocus()
        videoView!!.start()
        videoView!!.setOnCompletionListener {
            var run = Runnable {
                val intent = Intent(this@MainActivity,HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        Handler().postDelayed(run,1000)
        }

    }
    }


