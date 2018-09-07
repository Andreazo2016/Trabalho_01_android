package com.ufc.devman.trabalho_01_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class CadastroActivity : AppCompatActivity() {
    var paiseEscolhido:String? = null
    var classfic:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        val meusPaises = arrayOf("Adulto","Infantil","Adolecente")
        val cadNomeFilme:EditText? = findViewById(R.id.CadNomeFilme)
        val cadPrecoFilme:EditText? = findViewById(R.id.CadPrecoFilme)
        val spinnerClassFilmes = findViewById<Spinner>(R.id.SpinnerFilmes)
        val btnPaisesPopMenu = findViewById<Button>(R.id.CadPaises)
        val btnCad =  findViewById<Button>(R.id.CadBtn)
        val cancelBtn = findViewById<Button>(R.id.CancelBtn)


        //spinner
        spinnerClassFilmes!!.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                classfic = meusPaises[p2]
                Toast.makeText(this@CadastroActivity, meusPaises[p2], Toast.LENGTH_LONG).show()
            }
        }

        //popMenu
        btnPaisesPopMenu.setOnClickListener{ view ->
            when(view.id){
                R.id.CadPaises -> {
                    var popupMenu = PopupMenu(this@CadastroActivity,view)
                    popupMenu.inflate(R.menu.paisorigem)
                    popupMenu.setOnMenuItemClickListener( PopupMenu.OnMenuItemClickListener{ menuItem ->
                        when(menuItem!!.itemId){
                            R.id.p1 ->{
                                paiseEscolhido = menuItem.title.toString()
                                btnPaisesPopMenu.text = paiseEscolhido
                            }
                            R.id.p2 ->{
                                paiseEscolhido = menuItem.title.toString()
                                btnPaisesPopMenu.text = paiseEscolhido
                            }
                            R.id.p3 ->{
                                paiseEscolhido = menuItem.title.toString()
                                btnPaisesPopMenu.text = paiseEscolhido
                            }
                            R.id.p4 ->{
                                paiseEscolhido = menuItem.title.toString()
                                btnPaisesPopMenu.text = paiseEscolhido
                            }
                            R.id.p5 ->{
                                paiseEscolhido = menuItem.title.toString()
                                btnPaisesPopMenu.text = paiseEscolhido
                            }

                        }
                        true

                    })
                    popupMenu.show()
                }
            }
        }
        fun saveFilme(filme:Filme){
            Log.e("FILME: ",filme.toString())
        }
        //btnCadastro
        btnCad.setOnClickListener(){saveFilme(Filme(cadPrecoFilme?.text.toString(),cadNomeFilme?.text.toString(),classfic,paiseEscolhido))}


    }


}
