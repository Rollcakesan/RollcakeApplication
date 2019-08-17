package com.example.rollcakeapplication

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.rollcakeapplication.ui.main.SectionsPagerAdapter
import kotlinx.android.synthetic.main.fragment_main.*
import android.view.KeyEvent.KEYCODE_BACK



class MainActivity : AppCompatActivity() {

    private val sectionsPagerAdapter = SectionsPagerAdapter(this,supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        tabs.tabMode = TabLayout.MODE_SCROLLABLE
        tabs.maxScrollAmount




    }

}