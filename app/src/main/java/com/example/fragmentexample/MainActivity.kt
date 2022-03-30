package com.example.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val fragment = login()
//        showFragment(fragment)
    }
    fun showFragment(fragment: login){
        val fram = supportFragmentManager.beginTransaction()
        fram.replace(R.id.main_fragment,fragment)
        fram.commit()
    }
}