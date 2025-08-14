package com.example.calcularimc

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calcularimc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener {
            calcularIMC()
        }

    }

    private fun calcularIMC() {
        val peso   = binding.edtPeso.text.toString().toDoubleOrNull()
        val altura = binding.edtAltura.text.toString().toDoubleOrNull()

        if(peso == null || altura == null || altura <= 0) {
            binding.tvResultado.text = "Por favor, insira valores válidos!"
            return
        }

        val imc = peso / (altura * altura)
        val classificacao = classificacaoIMC(imc)

        binding.tvResultado.text = "Seu IMC é: %.2f\nClassificação: %s".format(imc, classificacao)

    }

    private fun classificacaoIMC(imc: Double): String {
        return when (imc) {
            in 0.0..18.4 -> "Abaixo do peso"
            in 18.5..24.9 -> "Peso normal"
            in 25.0..29.9 -> "Sobrepeso"
            in 30.0..34.9 -> "Obesidade grau I"
            in 35.0..39.9 -> "Obesidade grau II"
            else -> "Obesidade grau III"
        }
    }
}