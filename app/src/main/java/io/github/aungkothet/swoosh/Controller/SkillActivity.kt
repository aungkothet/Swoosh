package io.github.aungkothet.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import io.github.aungkothet.swoosh.Model.Player
import io.github.aungkothet.swoosh.R
import io.github.aungkothet.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {


    private lateinit var player:Player

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
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun goBackActivity(view: View){
        finish()
    }

    fun onSkillFinsheClick(view: View) {
        if (player.skill.isNullOrEmpty()) {
            Toast.makeText(this,"Please Choose at lease one skill.",Toast.LENGTH_SHORT).show()
        } else {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }
    }

    fun onBallerClick(view: View)
    {
        player.skill = "baller"
        beginner_skill_button.isChecked = false
    }

    fun onBeginnerClick(view: View)
    {
        player.skill = "beginner"
        baller_skill_button.isChecked = false
    }
}
