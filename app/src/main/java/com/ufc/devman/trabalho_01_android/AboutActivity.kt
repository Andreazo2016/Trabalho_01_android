package com.ufc.devman.trabalho_01_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.widget.Button
import android.widget.Toast

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnAbout =  findViewById<Button>(R.id.btn_about)
        btnAbout.setOnLongClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sobre App")
            builder.setMessage("App Desenvolvido para a disciplina de DevAndroid")
            builder.setPositiveButton("SIM"){dialog,which ->
                Toast.makeText(this,"Ok",Toast.LENGTH_LONG)
            }
            builder.setNegativeButton("NÃO"){diallog,which->
                Toast.makeText(this,"Não",Toast.LENGTH_LONG)
            }
            val dialod = builder.create()
            dialod.show()
            return@setOnLongClickListener true
        }
    }
}
