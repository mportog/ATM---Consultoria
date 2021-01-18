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
}