package com.ufc.devman.trabalho_01_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class AutocompleteActivity : AppCompatActivity() {
    var MesesVetor = arrayOf("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autocomplete)
        var autoComplete = findViewById<AutoCompleteTextView>(R.id.Autocomplete)
        var adapter = ArrayAdapter<String>(this@AutocompleteActivity,android.R.layout.simple_list_item_1, MesesVetor)
        autoComplete.setAdapter(adapter)
    }
}
