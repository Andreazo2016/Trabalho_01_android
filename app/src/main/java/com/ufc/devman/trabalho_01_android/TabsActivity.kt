package com.ufc.devman.trabalho_01_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.widget.TableLayout
import com.ufc.devman.trabalho_01_android.adapter.TabsAdapter
import com.ufc.devman.trabalho_01_android.fragment.TabOne
import com.ufc.devman.trabalho_01_android.fragment.TabTwo

class TabsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabs)
        val tabs = findViewById<TabLayout>(R.id.tabs_main)
        val viewPage = findViewById<ViewPager>(R.id.viewpager_main)
        val pageAdapter = TabsAdapter(supportFragmentManager, listOf(TabOne(),TabTwo()))
        viewPage.adapter = pageAdapter
        tabs.setupWithViewPager(viewPage)

    }
}
