package com.cookandroid.ex_contextmenuxml

import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.Me
import android.view.MenuItem

Itemm.4s
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.ex_contextmenuxml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 버튼에 대해 컨텍스트 메뉴를 등록
        registerForContextMenu(binding.button1)
        registerForContextMenu(binding.button2)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val mInflater: MenuInflater = menuInflater

        when (v?.id) {
            R.id.button1 -> mInflater.inflate(R.menu.menu1, menu)
            R.id.button2 -> mInflater.inflate(R.menu.menu2, menu)
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.itemRed -> {
            // 배경색을 빨간색으로 설정
            binding.main.setBackgroundColor(Color.RED)
            true
        }
        R.id.itemGreen -> {
            // 배경색을 초록색으로 설정
            binding.main.setBackgroundColor(Color.GREEN)
            true
        }
        R.id.itemBlue -> {
            // 배경색을 파란색으로 설정
            binding.main.setBackgroundColor(Color.BLUE)
            true
        }
        R.id.subItemRotate -> {
            // 버튼 45도 회전
            binding.button1.rotation = 45.0f
            true
        }
        R.id.subItemZoom -> {
            // 버튼 확대
            binding.button1.scaleX = 2.0f
            binding.button1.scaleY = 2.0f
            true
        }
        else -> super.onContextItemSelected(item)
    }
}
