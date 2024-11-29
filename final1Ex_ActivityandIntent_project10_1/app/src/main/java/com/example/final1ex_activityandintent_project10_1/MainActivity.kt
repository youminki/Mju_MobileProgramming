package com.example.final1ex_activityandintent_project10_1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.final1ex_activityandintent_project10_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("액티비티 생명주기", "MainActivity: onCreate()")

        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        bindingMain.btn2ndActivity.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val intent: Intent = Intent(applicationContext, SecondActivity::class.java)
                startActivity(intent)
            }
        })
    }
    override fun onStart(){
        super.onStart()
        Log.i("액티비티 생명주기", "MainActivity: onCreate()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("액티비티 생명주기", "MainActivity: onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("액티비티 생명주기", "MainActivity: onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("액티비티 생명주기", "MainActivity: onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("액티비티 생명주기", "MainActivity: onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("액티비티 생명주기", "MainActivity: onRestart()")
    }
}