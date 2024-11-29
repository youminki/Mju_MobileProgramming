package com.cookandroid.ex_optionmenuxml

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cookandroid.ex_optionmenuxml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
////        enableEdgeToEdge()
////        setContentView(R.layout.activity_main)
////        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
////            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
////            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
////            insets
//        }
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId) {
        R.id.itemRed -> {
            binding.main.setBackgroundColor(Color.RED)
            true
        }

        R.id.itemGreen -> {
            binding.main.setBackgroundColor(Color.GREEN)
            true
        }

        R.id.itemBlue -> {
            binding.main.setBackgroundColor(Color.BLUE)
            true
        }
        R.id.subItemRotate -> {
            binding.button1.setRotation(45.0f)
            true
        }

        R.id.subItemZoom -> {
            binding.button1.scaleX = 2.0f
            binding.button1.scaleY = 2.0f
            true
        }
        else -> super.onOptionsItemSelected(item)
    }
}