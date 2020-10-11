package com.example.semana05.recyclerView

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.semana05.R
import kotlinx.android.synthetic.main.item_persona.view.*

class PersonaVH(vista: View): RecyclerView.ViewHolder(vista) {
    val lblNombre = vista.findViewById<TextView>(R.id.tvNombre)
    val lblNumero : TextView = vista.findViewById(R.id.tvNumero)
}