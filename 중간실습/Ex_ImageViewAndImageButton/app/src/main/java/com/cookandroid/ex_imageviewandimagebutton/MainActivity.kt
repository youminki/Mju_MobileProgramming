package com.cookandroid.ex_imageviewandimagebutton

import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.ex_imageviewandimagebutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // CheckBox에 체크 상태에 따른 UI 표시 설정
        binding.ChkAgree.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.text2.visibility = View.VISIBLE
                binding.Rgroup1.visibility = View.VISIBLE
                binding.BtnOK.visibility = View.VISIBLE
                binding.ImgPet.visibility = View.VISIBLE
            } else {
                binding.text2.visibility = View.INVISIBLE
                binding.Rgroup1.visibility = View.INVISIBLE
                binding.BtnOK.visibility = View.INVISIBLE
                binding.ImgPet.visibility = View.INVISIBLE
            }
        }

        // Button 클릭 시 선택한 애완동물 이미지 표시
        binding.BtnOK.setOnClickListener {
            when (binding.Rgroup1.checkedRadioButtonId) {
                R.id.dog -> binding.ImgPet.setImageResource(R.drawable.dog)
                R.id.cat -> binding.ImgPet.setImageResource(R.drawable.cat)
                R.id.rabbit -> binding.ImgPet.setImageResource(R.drawable.rabbit)
                else -> Toast.makeText(applicationContext, "동물을 선택하세요", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
