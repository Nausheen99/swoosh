package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.R
import com.example.swoosh.utilities.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    //var selectedLeague = ""
    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){

            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun onMenClick(view: View) {
        womenBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "men's"
    }

    fun onWomenClick(view: View) {
        menBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "women's"
    }

    fun onCoedClick(view: View) {
        menBtn.isChecked = false
        womenBtn.isChecked = false
        player.league = "co-ed"
    }

    fun nextfun(view: View){
        if (player.league != "") {
            //nextBtn.setOnClickListener {
            val levelActivityIntent = Intent(this, LevelActivity::class.java)
            levelActivityIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(levelActivityIntent)
        } else{
            Toast.makeText(this, " Please select a league", Toast.LENGTH_SHORT).show()
        }
    }

}