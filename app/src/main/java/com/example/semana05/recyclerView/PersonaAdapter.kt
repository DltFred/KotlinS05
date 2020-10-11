package com.example.semana05.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.semana05.R

class PersonaAdapter (val listaPersonas: ArrayList<Persona>): RecyclerView.Adapter<PersonaVH>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaVH {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_persona, parent, false)
        return PersonaVH(vista)
    }

    override fun onBindViewHolder(holder: PersonaVH, position: Int) {
        val person = listaPersonas[position]
        holder.lblNombre.text = person.nombre
        holder.lblNumero.text = person.numero
    }

    override fun getItemCount(): Int {
        return listaPersonas.size
    }

}