package io.github.aungkothet.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import io.github.aungkothet.swoosh.Model.Player
import io.github.aungkothet.swoosh.R
import io.github.aungkothet.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        if(savedInstanceState != null)
            player = savedInstanceState?.getParcelable(EXTRA_PLAYER)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_league)
    }

    fun leagueNextClick(view: View){
        if(!player.league.isNullOrEmpty())
        {
            val intent = Intent(this, SkillActivity::class.java)
            intent.putExtra(EXTRA_PLAYER,player)
            startActivity(intent)
        }
        else{
            Toast.makeText(this,"Please select a league!!",Toast.LENGTH_SHORT).show()
        }
    }

    fun onWomenClick(view: View)
    {
        player.league = "womens"
        btn_men_league.isChecked=false
        btn_coed_league.isChecked=false
    }

    fun  onMensClick(view: View){
        player.league = "mens"
        btn_women_league.isChecked=false
        btn_coed_league.isChecked=false
    }

    fun  onCoedClicked(view: View)
    {
        player.league = "co-ed"
        btn_men_league.isChecked=false
        btn_women_league.isChecked=false
    }



}
