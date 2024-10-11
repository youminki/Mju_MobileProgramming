package com.cookandroid.project_4_2_0792

import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cookandroid.project_4_2_0792.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        binding = ActivityMainBinding.inflate((layoutInflater))

        setContentView(binding.root)

        binding.ChkAgree.setOnCheckedChangeListener(object: CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
//                TODO("Not yet implemented")
                if(binding.ChkAgree.isChecked() == true){
                    binding.Text2.visibility = View.VISIBLE
                    binding.Rgroup1.visibility = View.VISIBLE
                    binding.BtnOK.visibility = View.VISIBLE
                    binding.ImgPet.visibility = View.VISIBLE
                } else{
                    binding.Text2.visibility = View.INVISIBLE
                    binding.Rgroup1.visibility = View.INVISIBLE
                    binding.BtnOK.visibility = View.INVISIBLE
                    binding.ImgPet.visibility = View.INVISIBLE
                }
            }
        })
        binding.BtnOK.setOnClickListener{
            when (binding.Rgroup1.checkedRadioButtonId) {
                R.id.RdoDog -> {
                    binding.ImgPet.setImageResource(R.drawable.dog)
                }
                R.id.RdoCat -> {
                    binding.ImgPet.setImageResource(R.drawable.cat)
                }
                R.id.RdoRabbit -> {
                    binding.ImgPet.setImageResource(R.drawable.rabbit)
                } else ->
                Toast.makeText(applicationContext, "세가지 동물 중 하나를 선택하세요", Toast.LENGTH_LONG).show()
            }
        }
    }
}