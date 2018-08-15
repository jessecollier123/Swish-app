package com.example.jesse1.swish.Controller

import android.os.Bundle
import com.example.jesse1.swish.R
import com.example.jesse1.swish.Utilities.EXTRA_LEAGUE
import com.example.jesse1.swish.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesTxt.text = "Looking for a $league $skill league near you..."
    }
}
