package com.nekiol.br.bundleextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nekiol.br.bundleextras.databinding.ActivityMain2Binding
import com.nekiol.br.bundleextras.databinding.ActivityMain3Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent

        val bundle = i.extras

        binding.buttonOk.setOnClickListener {
            val numero = binding.editNumero.text.toString().toInt()

            val i = Intent(this, MainActivity3::class.java)
            if (bundle != null){
                i.putExtras(bundle)
            }
            i.putExtra("numero2", numero)
            startActivity(i)
        }
    }
}