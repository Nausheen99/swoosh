package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_level.*
import kotlinx.android.synthetic.main.activity_main.*

class LevelActivity : BaseActivity() {
    var league = ""
    var lvl = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)

    }

    fun onBeginnerClick(){
        ballerBtn.isChecked  = false
        lvl = "Beginner"
    }
    fun onBallerClick(){
        beginnerBtn.isChecked = false
        lvl = "Baller"
    }

    fun finishfun (view: View){
        if (lvl != ""){

        val loadingActivityIntent = Intent(this, LoadingActivity::class.java)
        startActivity(loadingActivityIntent)
    }else{
        Toast.makeText(this, "Please select preferred level", Toast.LENGTH_SHORT).show()
        }
    }
}