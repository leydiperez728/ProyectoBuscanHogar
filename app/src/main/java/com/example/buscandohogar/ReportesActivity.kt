package com.example.buscandohogar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_reportes.*

class ReportesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reportes)

        zona_id.setOnClickListener { view ->
            openReportesSecondActivity()
        }
    }

        fun openReportesSecondActivity () {
            val intent = Intent(this, ReportesSecondActivity::class.java)
            startActivity(intent)
        }
}
