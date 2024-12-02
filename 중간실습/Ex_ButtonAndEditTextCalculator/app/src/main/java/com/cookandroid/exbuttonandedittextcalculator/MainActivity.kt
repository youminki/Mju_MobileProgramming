package com.cookandroid.exbuttonandedittextcalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cookandroid.exbuttonandedittextcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding


    private var num1: String = ""
    private var num2: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtnAdd.setOnClickListener(){
            num1 = binding.Edit1.text.toString()
            num2 = binding.Edit2.text.toString()
            var resultAdd:Int = num1.toInt() + num2.toInt()

            binding.TextResult.setText("계산결과 : " + resultAdd.toString())
        }

        binding.BtnMinus.setOnClickListener(){
            num1 = binding.Edit1.text.toString()
            num2 = binding.Edit2.text.toString()
            var resultMinus:Int = num1.toInt() - num2.toInt()

            binding.TextResult.setText("계산결과 : " + resultMinus.toString())
        }

        binding.BtnMul.setOnClickListener(){
            num1 = binding.Edit1.text.toString()
            num2 = binding.Edit2.text.toString()
            var resultMul:Int = num1.toInt() * num2.toInt()

            binding.TextResult.setText("계산결과 : " + resultMul.toString())
        }

        binding.BtnDiv.setOnClickListener(){
            num1 = binding.Edit1.text.toString()
            num2 = binding.Edit2.text.toString()
            var resultDiv:Int = num1.toInt() / num2.toInt()

            binding.TextResult.setText("계산결과 : " + resultDiv.toString())
        }
    }

}