package com.example.dadovirtual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.dadovirtual.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val botaoCalcular = binding.buttonCalcular

        binding.toggleButton.addOnButtonCheckedListener { toggleButtonGroup, checkedId, isChecked ->
            if(isChecked) {
                val imgDado = binding.imageViewDado
                when(checkedId) {
                    R.id.buttonD4 -> {
                        lancarDado(4)
                        binding.buttonCalcular.setOnClickListener { lancarDado(4) }
                    }
                    R.id.buttonD6 -> {
                        lancarDado(6)
                        binding.buttonCalcular.setOnClickListener { lancarDado(6) }
                    }

                    R.id.buttonD8 -> {
                        lancarDado(8)
                        binding.buttonCalcular.setOnClickListener { lancarDado(8) }
                    }

                    R.id.buttonD10 -> {
                        lancarDado(10)
                        binding.buttonCalcular.setOnClickListener { lancarDado(10) }
                    }
                    R.id.buttonD12 -> {
                        lancarDado(12)
                        binding.buttonCalcular.setOnClickListener { lancarDado(12) }
                    }

                    R.id.buttonD20 -> {
                        lancarDado(20)
                        binding.buttonCalcular.setOnClickListener { lancarDado(20) }
                    }
                }
            } else {
                if (toggleButtonGroup.checkedButtonId == View.NO_ID) {
                    Toast.makeText(this, "Selecione uma das opções", Toast.LENGTH_SHORT)
                }
            }
        }

        botaoCalcular.setOnClickListener{ lancarDado(6) }
        lancarDado(6)

    }

    private fun lancarDado(nLados: Int) {
        val dado = Dado(nLados)
        val lancamentoDoDado = dado.lancar()
        val fotoDoDado = binding.imageViewDado

        when (nLados) {
            4 -> {
                when(lancamentoDoDado) {
                    1 -> fotoDoDado.setImageResource(R.drawable.ic_d4_1)
                    2 -> fotoDoDado.setImageResource(R.drawable.ic_d4_2)
                    3 -> fotoDoDado.setImageResource(R.drawable.ic_d4_3)
                    4 -> fotoDoDado.setImageResource(R.drawable.ic_d4_4)
                }
            }
            6 -> {
                when(lancamentoDoDado) {
                    1 -> fotoDoDado.setImageResource(R.drawable.ic_d6_1)
                    2 -> fotoDoDado.setImageResource(R.drawable.ic_d6_2)
                    3 -> fotoDoDado.setImageResource(R.drawable.ic_d6_3)
                    4 -> fotoDoDado.setImageResource(R.drawable.ic_d6_4)
                    5 -> fotoDoDado.setImageResource(R.drawable.ic_d6_5)
                    else -> fotoDoDado.setImageResource(R.drawable.ic_d6_6)
                }
            }
            8 -> {
                when(lancamentoDoDado) {
                    1 -> fotoDoDado.setImageResource(R.drawable.ic_d8_1)
                    2 -> fotoDoDado.setImageResource(R.drawable.ic_d8_2)
                    3 -> fotoDoDado.setImageResource(R.drawable.ic_d8_3)
                    4 -> fotoDoDado.setImageResource(R.drawable.ic_d8_4)
                    5 -> fotoDoDado.setImageResource(R.drawable.ic_d8_5)
                    6 -> fotoDoDado.setImageResource(R.drawable.ic_d8_6)
                    7 -> fotoDoDado.setImageResource(R.drawable.ic_d8_7)
                    8 -> fotoDoDado.setImageResource(R.drawable.ic_d8_8)
                }
            }
            10 -> {
                when(lancamentoDoDado) {
                    1 -> fotoDoDado.setImageResource(R.drawable.d10_1)
                    2 -> fotoDoDado.setImageResource(R.drawable.d10_2)
                    3 -> fotoDoDado.setImageResource(R.drawable.d10_3)
                    4 -> fotoDoDado.setImageResource(R.drawable.d10_4)
                    5 -> fotoDoDado.setImageResource(R.drawable.d10_5)
                    6 -> fotoDoDado.setImageResource(R.drawable.d10_6)
                    7 -> fotoDoDado.setImageResource(R.drawable.d10_7)
                    8 -> fotoDoDado.setImageResource(R.drawable.d10_8)
                    9 -> fotoDoDado.setImageResource(R.drawable.d10_8)
                    10 -> fotoDoDado.setImageResource(R.drawable.d10_8)
                }
            }
            12 -> {
                when(lancamentoDoDado) {
                    1 -> fotoDoDado.setImageResource(R.drawable.d12_1)
                    2 -> fotoDoDado.setImageResource(R.drawable.d12_2)
                    3 -> fotoDoDado.setImageResource(R.drawable.d12_3)
                    4 -> fotoDoDado.setImageResource(R.drawable.d12_4)
                    5 -> fotoDoDado.setImageResource(R.drawable.d12_5)
                    6 -> fotoDoDado.setImageResource(R.drawable.d12_6)
                    7 -> fotoDoDado.setImageResource(R.drawable.d12_7)
                    8 -> fotoDoDado.setImageResource(R.drawable.d12_8)
                    9 -> fotoDoDado.setImageResource(R.drawable.d12_9)
                    10 -> fotoDoDado.setImageResource(R.drawable.d12_10)
                    11 -> fotoDoDado.setImageResource(R.drawable.d12_11)
                    12 -> fotoDoDado.setImageResource(R.drawable.d12_12)
                }
            }
            20 -> {
                when(lancamentoDoDado) {
                    1 -> fotoDoDado.setImageResource(R.drawable.d20_1)
                    2 -> fotoDoDado.setImageResource(R.drawable.d20_2)
                    3 -> fotoDoDado.setImageResource(R.drawable.d20_3)
                    4 -> fotoDoDado.setImageResource(R.drawable.d20_4)
                    5 -> fotoDoDado.setImageResource(R.drawable.d20_5)
                    6 -> fotoDoDado.setImageResource(R.drawable.d20_6)
                    7 -> fotoDoDado.setImageResource(R.drawable.d20_7)
                    8 -> fotoDoDado.setImageResource(R.drawable.d20_8)
                    9 -> fotoDoDado.setImageResource(R.drawable.d20_9)
                    10 -> fotoDoDado.setImageResource(R.drawable.d20_10)
                    11 -> fotoDoDado.setImageResource(R.drawable.d20_11)
                    12 -> fotoDoDado.setImageResource(R.drawable.d20_12)
                    13 -> fotoDoDado.setImageResource(R.drawable.d20_13)
                    14 -> fotoDoDado.setImageResource(R.drawable.d20_14)
                    15 -> fotoDoDado.setImageResource(R.drawable.d20_15)
                    16 -> fotoDoDado.setImageResource(R.drawable.d20_16)
                    17 -> fotoDoDado.setImageResource(R.drawable.d20_17)
                    18 -> fotoDoDado.setImageResource(R.drawable.d20_18)
                    19 -> fotoDoDado.setImageResource(R.drawable.d20_19)
                    20 -> fotoDoDado.setImageResource(R.drawable.d20_20)
                }
            }
        }

        fotoDoDado.contentDescription = "O lado selecionado foi $lancamentoDoDado"
    }
}

class Dado(private val numLados: Int) {
    fun lancar(): Int {
        return(1..numLados).random()
    }
}