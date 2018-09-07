package com.ufc.devman.trabalho_01_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.ufc.devman.trabalho_01_android.adapter.GridViewAdapter

class GridViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)
        var MesesVetor = listOf("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro")
        val gridView = findViewById<GridView>(R.id.gridview)
        gridView.adapter = GridViewAdapter(this@GridViewActivity,MesesVetor)
    }
}
