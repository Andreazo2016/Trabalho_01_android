package com.ufc.devman.trabalho_01_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "Trabalho Dev android"
        val toggleButon = findViewById<ToggleButton>(R.id.toggleButon)
        val radionGroup =  findViewById<RadioGroup>(R.id.RGroup)
        val text = findViewById<TextView>(R.id.textShow)
        radionGroup.setOnCheckedChangeListener{group,checkedID ->
            when(checkedID){
                R.id.rd1  ->{
                   text.text = "RADIO 1"
                }

                R.id.rd2 ->{
                    text.text = "RADIO 2"
                }
            }
        }


        val btnCad = findViewById<Button>(R.id.btnCad)
        btnCad.setOnClickListener{
            startActivity(Intent(this@MainActivity,CadastroActivity::class.java))
        }
        toggleButon.setOnCheckedChangeListener{btun,isChecked ->
           if(isChecked)
               text.text = "TOGGLE LIGADO"
           else
               text.text = "TOGGLE DESLIGADO"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.menuoption,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.listView ->{
                startActivity(Intent(this@MainActivity,FilmsActivity::class.java))
                return true
            }
            R.id.tocar_musica->{
                return true
            }
            R.id.imageFundo -> {
                startActivity (Intent(this@MainActivity,ImageFundo::class.java))
                return true
            }
            R.id.About ->{
                startActivity(Intent(this@MainActivity,AboutActivity::class.java))
                return true
            }
            R.id.Tabs ->{
                startActivity(Intent(this@MainActivity,TabsActivity::class.java))
                return true
            }
            R.id.autocomplete ->{
                startActivity(Intent(this@MainActivity,AutocompleteActivity::class.java))
                return true
            }
            R.id.grid ->{
                startActivity(Intent(this@MainActivity,GridViewActivity::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
