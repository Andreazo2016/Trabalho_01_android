package com.ufc.devman.trabalho_01_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.ufc.devman.trabalho_01_android.adapter.FilmeAdapter

class FilmsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_films)
        val listaFilmes = findViewById(R.id.lista_filmes) as ListView
        listaFilmes.adapter = FilmeAdapter(this)
    }
}
