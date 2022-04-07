package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.swoosh.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        goToLeagueActivity.setOnClickListener {
            val leagueActivityIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueActivityIntent)
        }

    }
}