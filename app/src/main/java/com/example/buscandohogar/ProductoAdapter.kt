package com.example.buscandohogar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_producto.view.*

class ProductoAdapter (private val mContext: Context, private val listaProducto: List<Producto>): ArrayAdapter <Producto>(mContext, 0, listaProducto){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_producto, parent, false)

        val producto = listaProducto[position]
        layout.nombre_id.text = producto.nombre
        layout.imageView2.setImageResource(producto.imagen)

        return layout
    }
}