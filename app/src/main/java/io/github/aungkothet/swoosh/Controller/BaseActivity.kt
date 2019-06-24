package io.github.aungkothet.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"${javaClass.simpleName} start onCreate")
        super.onCreate(savedInstanceState)
    }


    override fun onStart() {
        Log.d(TAG,"${javaClass.simpleName} start onStart")
        super.onStart()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName} start onStop")
        super.onStop()
    }

    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName} start onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName} start onDestory")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d(TAG,"${javaClass.simpleName} start onRestart")
        super.onRestart()
    }

    override fun onResume() {
        Log.d(TAG,"${javaClass.simpleName} start onResume")
        super.onResume()
    }
}
