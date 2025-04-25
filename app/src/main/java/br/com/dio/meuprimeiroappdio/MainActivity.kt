package br.com.dio.meuprimeiroappdio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtHello = findViewById<TextView>(R.id.txtHello)
        val btnChange = findViewById<Button>(R.id.btnChange)

        btnChange.setOnClickListener {
            txtHello.text = "Texto alterado com sucesso!"
        }
    }
}