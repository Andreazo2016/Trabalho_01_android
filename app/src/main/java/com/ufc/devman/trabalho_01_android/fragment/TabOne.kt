package com.ufc.devman.trabalho_01_android.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ufc.devman.trabalho_01_android.R

class TabOne():Fragment(){
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.tab_one_layout,container,false)
    }
}