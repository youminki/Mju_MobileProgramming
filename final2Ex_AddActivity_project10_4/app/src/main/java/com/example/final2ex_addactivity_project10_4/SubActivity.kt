package com.example.final2ex_addactivity_project10_4

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.final2ex_addactivity_project10_4.databinding.ActivitySubBinding


class SubActivity : AppCompatActivity() {
    private lateinit var bindingSub: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingSub = ActivitySubBinding.inflate(layoutInflater)
        setContentView(bindingSub.root)

        val rxIntent: Intent = getIntent()
        val num1: Int = rxIntent.getIntExtra("Num1", 0)
        val num2: Int = rxIntent.getIntExtra("Num2", 0)
        val sum: Int = num1 - num2

        bindingSub.btnReturn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val outIntent: Intent = Intent(this@SubActivity, MainActivity::class.java)
                outIntent.putExtra("Sum", sum)
                setResult(1001, outIntent)
                finish()
            }
        })

    }
}