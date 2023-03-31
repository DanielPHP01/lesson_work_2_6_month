package com.example.lesson_work_2_6_month

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson_work_2_6_month.databinding.ActivityMainBinding
import kotlin.math.roundToInt
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var list = mutableListOf<Double>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        binding.btnAdd.setOnClickListener {
            if (binding.etMain.text.isNotEmpty()) {
                list.add(sqrt(binding.etMain.text.toString().toDouble()))
                binding.etMain.text.clear()
            }
        }
        binding.btnPrint.setOnClickListener {
            binding.tvMain.text = list.toString()
        }
    }
}