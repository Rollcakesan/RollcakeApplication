package com.example.rollcakeapplication.ui.main

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.rollcakeapplication.MainActivity
import com.example.rollcakeapplication.R
import kotlinx.android.synthetic.main.fragment_main.*

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3,
    R.string.tab_text_4,
    R.string.tab_text_5,
    R.string.tab_text_6,
    R.string.tab_text_7,
    R.string.tab_text_8,
    R.string.tab_text_9,
    R.string.tab_text_10,
    R.string.tab_text_11,
    R.string.tab_text_12,
    R.string.tab_text_13
)


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        val instance= PlaceholderFragment.newInstance(position+1)


            return instance
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 4 total pages.
        return 13
    }
}