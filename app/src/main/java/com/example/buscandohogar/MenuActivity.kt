package com.example.buscandohogar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        Cachorros_id.setOnClickListener { view ->
            openCachorrosActivity()

        }

    }
        fun openCachorrosActivity() {
            val intent = Intent(this, CachorrosActivity::class.java)
            startActivity(intent)
        }


}