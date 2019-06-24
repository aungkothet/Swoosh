package io.github.aungkothet.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import io.github.aungkothet.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetStarted.setOnClickListener {
            val intent = Intent(this, LeagueActivity::class.java)
            startActivity(intent)
        }
    }
}
