package com.ufc.devman.trabalho_01_android.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class TabsAdapter(fm:FragmentManager,listFrag:List<Fragment>?):FragmentPagerAdapter(fm){

    var listFrag:List<Fragment>?

    init {
        this.listFrag = listFrag
    }
    override fun getCount(): Int {
       return this.listFrag!!.size
    }

    override fun getItem(p0: Int): Fragment {
        return this.listFrag!!.get(p0)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
             0 ->{
                 return "TAB 1"
             }
            else -> {
                return "TAB 2"
            }
        }
    }
}