package com.nekiol.br.bundleextras

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nekiol.br.bundleextras.databinding.ActivityMain2Binding
import com.nekiol.br.bundleextras.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val i = intent

        val numero1 = i.extras?.getInt("numero1")
        val numero2 = i.extras?.getInt("numero2")

        if(numero1 != null && numero2 != null){
            val soma = numero2 + numero2
            binding.textResult.setText("Soma: $soma")
        }else{
            binding.textResult.setText("Erro")
        }
    }
}