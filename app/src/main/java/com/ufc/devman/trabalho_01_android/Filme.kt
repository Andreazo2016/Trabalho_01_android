package com.ufc.devman.trabalho_01_android

public class Filme(preco:String?,nome:String?,classificacao:String?,paisOrigen:String?){
     var preco:String?= null
     var nome:String?=null
    var classificacao:String? = null
    var paisOrigen:String? = null
    init {
        this.preco = preco
        this.nome = nome
        this.classificacao = classificacao
        this.paisOrigen = paisOrigen
    }

    override fun toString(): String {
        return "nome: ${this.nome} preco: ${this.preco} classificação: ${this.classificacao} pais: ${this.paisOrigen}"
    }

}