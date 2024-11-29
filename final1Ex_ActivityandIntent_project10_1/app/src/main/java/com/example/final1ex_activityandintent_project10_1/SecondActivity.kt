package com.example.final1ex_activityandintent_project10_1

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.final1ex_activityandintent_project10_1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var bindingSecond: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("액티비티 생명주기", "SecondActivity: onCreate()")

        bindingSecond = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingSecond.root)

        bindingSecond.btnReturn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                finish()
            }
        })


    }
}