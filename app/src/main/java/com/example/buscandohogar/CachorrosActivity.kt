package com.example.buscandohogar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cachorros.*

class CachorrosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cachorros)

        val producto = Producto (nombre = "Brenda", descripción = "es linda", imagen = R.drawable.brenda)
        val producto1 = Producto (nombre = "Luna", descripción = "es linda", imagen = R.drawable.luna)
        val producto2 = Producto (nombre = "Sancho", descripción = "es linda", imagen = R.drawable.sancho)

        val listaProducto = listOf(producto, producto1, producto2)
        val adapter = ProductoAdapter(this, listaProducto)
        lista_id.adapter = adapter

    }
}
