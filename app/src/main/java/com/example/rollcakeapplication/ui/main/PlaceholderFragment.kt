package com.example.rollcakeapplication.ui.main

import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.rollcakeapplication.R
import kotlinx.android.synthetic.main.fragment_main.*
import java.security.KeyStore

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        pageViewModel = ViewModelProviders.of(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    override fun getContext(): Context? {
        return super.getContext()
    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val root = inflater.inflate(R.layout.fragment_main, container, false)
        val wv:WebView = root.findViewById(R.id.webView)
        wv.webViewClient = WebViewClient()


        pageViewModel.text.observe(this, Observer<Int> {

            val wv:WebView = root.findViewById(R.id.webView)
            wv.settings.javaScriptEnabled = true
            wv.loadUrl(resources.getStringArray(R.array.urls)[it-1])
        })

        wv.setOnKeyListener { v, i, keyEvent ->(i==KeyEvent.KEYCODE_BACK).apply { wv.goBack() }  }
        wv.isFocusableInTouchMode = true
        wv.requestFocus()





        return root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}