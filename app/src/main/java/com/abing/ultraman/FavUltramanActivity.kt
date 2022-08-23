package com.abing.ultraman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit

class FavUltramanActivity : AppCompatActivity(R.layout.activity_fav_ultraman) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FavUltramanFragment>(R.id.fragment_container_view)
            }
        }
        setSupportActionBar(findViewById(R.id.fav_ultraman_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}