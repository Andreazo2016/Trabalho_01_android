package com.ufc.devman.trabalho_01_android.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.ufc.devman.trabalho_01_android.Filme
import com.ufc.devman.trabalho_01_android.R

public class FilmeAdapter(context: Context):BaseAdapter(){

    val ListaFilmes = listOf<Filme>(Filme("0","A Lenda de Shenlong","",""),
            Filme("1","O Homem Mais Forte do Mundo","",""),
            Filme("2","Goku, o Super Saiyajin","",""),
            Filme("3","Uma Vingança Para Freeza","",""))
    val mInflator:LayoutInflater
    init {
        this.mInflator= LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return ListaFilmes.size
    }

    override fun getItem(p0: Int): Any {
        return ListaFilmes[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }
    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        val info_filme = this.mInflator.inflate(R.layout.info_filme,parent,false)
        val nomeFilme = info_filme.findViewById<TextView>(R.id.nomeFilme)
        val precoFilme = info_filme.findViewById<TextView>(R.id.precoFilme)
        nomeFilme.text = this.ListaFilmes.get(position).nome
        precoFilme.text = this.ListaFilmes.get(position).preco.toString()
        return info_filme
    }
}