package com.nekiol.br.bundleextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nekiol.br.bundleextras.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOk.setOnClickListener {
            val numero = binding.editNumero.text.toString().trim().toInt()

            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("mumero1", numero)
            startActivity(i)
        }
    }
}