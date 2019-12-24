package com.mix.journaler2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mix.journaler2.R
import com.mix.journaler2.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MainFragment.newInstance())
                .commitNow()
        }
    }
}
