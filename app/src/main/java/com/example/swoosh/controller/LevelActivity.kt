package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.R
import com.example.swoosh.utilities.Player
import kotlinx.android.synthetic.main.activity_level.*

class LevelActivity : BaseActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
        println(player)
    }

    fun onBeginnerClick(view: View){
        ballerBtn.isChecked  = false
        player.level = "Beginner"
    }
    fun onBallerClick(view: View){
        beginnerBtn.isChecked = false
        player.level = "Baller"
    }

    fun finishfun (view: View){
        if (player.level != ""){
            val loadingActivityIntent = Intent(this, LoadingActivity::class.java)
            loadingActivityIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(loadingActivityIntent)
    }else{
        Toast.makeText(this, "Please select preferred level", Toast.LENGTH_SHORT).show()
        }
    }
}