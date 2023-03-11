package com.alexandrestefani.experimento2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    var textoEditavel : EditText? = null
    var textotela1 : TextView? = null
    var tela: LinearLayoutCompat? = null
    var quantidadeClics = 0
    var texto2tela1: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textotela1 = findViewById<TextView>(R.id.primeirotextotela1)
        textotela1?.text = "texto"
        texto2tela1 = findViewById(R.id.segundotextotela1)


        tela = findViewById(R.id.tela1)

        val botaotela1 = findViewById<Button>(R.id.buttontela1)
        botaotela1.setOnClickListener {
            changeimages()
            quantidadeClics++
            texto2tela1?.text=quantidadeClics?.toString()

        }
        textoEditavel = findViewById<EditText>(R.id.caixatextotela1)

        textoEditavel?.addTextChangedListener {
            textotela1?.text = it?.toString()
        }




        tela?.background=getDrawable(R.drawable.rupestre01)

    }
    fun changeimages(){
        when{
            quantidadeClics % 2 ==0 ->  tela?.background=getDrawable(R.drawable.rupestre04  )
            quantidadeClics % 3 ==0 ->  tela?.background=getDrawable(R.drawable.rupestre3)
            else ->  tela?.background=getDrawable(R.drawable.rupestre01)
        }



    }




}