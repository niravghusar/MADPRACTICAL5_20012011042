package com.example.madpractical5_20012011042
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
class MainActivity : AppCompatActivity() {
    private lateinit var play: FloatingActionButton
    private lateinit var stop: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        play = findViewById(R.id.btn_play)
        play.setOnClickListener{
            play()
        }
        stop = findViewById(R.id.btn_stop)
        stop.setOnClickListener{
            stop()
        }
    }

    private fun play(){
        Intent(applicationContext,MediaService::class.java).putExtra(
            MediaService.DATA_KEY,MediaService.DATA_VALUE).apply { startService(this) }
    }
    private fun stop(){
        Intent(applicationContext,MediaService::class.java).apply { stopService(this) }
    }
}