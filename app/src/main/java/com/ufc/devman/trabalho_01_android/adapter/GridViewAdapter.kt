package com.ufc.devman.trabalho_01_android.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class GridViewAdapter(ctx:Context,lst:List<String>):BaseAdapter(){
    val lst:List<String>
    val ctx:Context
    init {
        this.lst = lst
        this.ctx = ctx
    }
    override fun getCount(): Int {
        return this.lst.size
    }

    override fun getItem(p0: Int): Any {
        return this.lst.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
         val nome = TextView(this.ctx)
        nome.text  = this.lst.get(p0)
        return nome
    }
}