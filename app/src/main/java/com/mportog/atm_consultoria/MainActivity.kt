package com.mportog.atm_consultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT).show()

        button_contato.setOnClickListener {
            Toast.makeText(applicationContext, "Redirecionando para Contato", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, DetalheContatoActivity :: class.java))
        }

        button_empresa.setOnClickListener {
            startActivity(Intent(this, DetalheEmpresaActivity :: class.java))
        }

        button_servicos.setOnClickListener {
            startActivity(Intent(this, DetalheSevicoActivity :: class.java))
        }

        button_clientes.setOnClickListener {
            startActivity(Intent(this, DetalheClienteActivity :: class.java))
        }

    }

    override fun onStart() {
        super.onStart()
Toast.makeText(applicationContext, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
    Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_SHORT).show()
    }
}