package com.example.semana05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.semana05.recyclerView.Persona
import com.example.semana05.recyclerView.PersonaAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = ArrayList<Persona>()
        lista.add(Persona(nombre = "asdffsadf", numero = "3453245234"))
        lista.add(Persona(nombre = "asdf3f", numero = "34545234"))
        lista.add(Persona(nombre = "assadf", numero = "3453234"))
        lista.add(Persona(nombre = "asdf", numero = "3453234"))
        rvAgenda.layoutManager = LinearLayoutManager(this)
        rvAgenda.adapter = PersonaAdapter(lista)
    }
}