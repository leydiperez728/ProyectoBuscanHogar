package com.example.buscandohogar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
   // lateinit var myAdapter: ArrayAdapter<String>
    //var Menu = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        // mostrarTareas()
        //cargarDatos()
        //lista_id.setOnItemClickListener { parent, view, position, id -> }
        contactos_id.setOnClickListener { view ->
            openContactosActivity()
        }
        adopcion_id.setOnClickListener { view ->
            openMenuActivity()
        }
        esterilizacion_id.setOnClickListener { view ->
            openEsterilizarActivity()
        }
        reportes_id.setOnClickListener { view ->
            openReportesActivity()
        }
        veterinaria_id.setOnClickListener { view ->
            openVeterinariaActivity()
        }
        veterinaria_id.setOnClickListener { view ->
            openVeterinariaActivity()
        }
        preguntas_id.setOnClickListener { view ->
            openPreguntasActivity()
        }
    }
    /*
    fun mostrarTareas (){
        Log.d("lpl", "lista es lll ${Menu.toString()}")
        myAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Menu)
        lista_id.adapter = myAdapter
        myAdapter.notifyDataSetChanged()

    }

    fun cargarDatos(){
        val outStream = PrintStream(openFileOutput("Tareas.txt", Context.MODE_PRIVATE))
        outStream.println("Contactos")
        outStream.println("Adopción de Animales")
        outStream.println("Esterilización")
        outStream.println("Reportes")
        outStream.println("Veterinarias")
        outStream.println("Preguntas Frecuentes")
        outStream.close()
        // poblarArchivo ()
    }*/
    fun openContactosActivity () {
        val intent = Intent(this, ContactosActivity::class.java)
        startActivity(intent)
    }
    fun openMenuActivity () {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
    fun openEsterilizarActivity () {
        val intent = Intent(this, EsterillizarActivity::class.java)
        startActivity(intent)
    }
    fun openReportesActivity () {
        val intent = Intent(this, ReportesActivity::class.java)
        startActivity(intent)
    }
    fun openPreguntasActivity () {
        val intent = Intent(this, PreguntasActivity::class.java)
        startActivity(intent)
    }
    fun openVeterinariaActivity () {
        val intent = Intent(this, VeterinariaActivity::class.java)
        startActivity(intent)
    }
}