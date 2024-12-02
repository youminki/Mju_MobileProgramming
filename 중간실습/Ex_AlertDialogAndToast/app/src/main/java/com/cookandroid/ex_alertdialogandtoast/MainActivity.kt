package com.cookandroid.ex_alertdialogandtoast

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.ex_alertdialogandtoast.databinding.ActivityMainBinding
import com.cookandroid.ex_alertdialogandtoast.databinding.DialogInputBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ViewBinding을 사용하여 레이아웃 설정
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 입력 버튼 클릭 시 AlertDialog 띄우기
        binding.InputButton.setOnClickListener {
            showInputDialog()
        }
    }

    private fun showInputDialog() {
        // DialogInputBinding을 사용해 커스텀 다이얼로그 레이아웃 설정
        val dialogBinding = DialogInputBinding.inflate(layoutInflater)

        // AlertDialog 빌더 생성
        val builder = AlertDialog.Builder(this)
        builder.setView(dialogBinding.root)

        // 확인 버튼 설정
        builder.setPositiveButton("확인") { dialog, which ->
            val enteredName = dialogBinding.userNameInput.text.toString()
            val enteredEmail = dialogBinding.userEmailInput.text.toString()

            if (enteredName.isNotEmpty() && enteredEmail.isNotEmpty()) {
                // 입력한 정보를 TextView에 표시
                binding.UserName.text = enteredName
                binding.UserEmail.text = enteredEmail
            } else {
                // 입력이 비어 있으면 토스트 메시지 표시
                Toast.makeText(this, "이름과 이메일을 입력하세요", Toast.LENGTH_SHORT).show()
            }
        }

        // 취소 버튼 설정
        builder.setNegativeButton("취소") { dialog, which ->
            // 취소 시 토스트 메시지 표시
            Toast.makeText(this, "취소했습니다", Toast.LENGTH_SHORT).show()
        }

        // AlertDialog 보여주기
        builder.show()
    }
}
