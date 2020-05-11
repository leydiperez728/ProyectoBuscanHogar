package com.example.buscandohogar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_esterillizar.*
import kotlinx.android.synthetic.main.activity_second.*

class EsterillizarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esterillizar)

        camp_id.setOnClickListener { view ->
            openCampanaSecondActivity()
        }
        string_id.setOnClickListener { view ->
            openDireccionSecondActivity()
        }
    }

    fun openCampanaSecondActivity () {
        val intent = Intent(this, CampanaSecondActivity::class.java)
        startActivity(intent)
    }
    fun openDireccionSecondActivity () {
        val intent = Intent(this, DireccionSecondActivity::class.java)
        startActivity(intent)
    }
}
