package io.github.aungkothet.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.github.aungkothet.swoosh.Model.Player
import io.github.aungkothet.swoosh.R
import io.github.aungkothet.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player:Player = intent.getParcelableExtra(EXTRA_PLAYER)
        search_league_textview.text = "Looking for a ${player.league} ${player.skill} league near you ...."
    }
}
