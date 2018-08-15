package com.example.jesse1.swish.Controller

import android.os.Bundle
import com.example.jesse1.swish.Model.Player
import com.example.jesse1.swish.R
import com.example.jesse1.swish.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesTxt.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
