package com.example.final3ex_commbetweenfragment_project10_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.final3ex_commbetweenfragment_project10_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), FragmentA.FragmentAListener, FragmentB.FragmentBListener {
    private lateinit var bindingMain: ActivityMainBinding
    private lateinit var fragmentA: FragmentA
    private lateinit var fragmentB: FragmentB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        fragmentA = FragmentA()
        fragmentB = FragmentB()

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.add(R.id.container_a, fragmentA)
        fragmentTransaction.add(R.id.container_b, fragmentB)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    override fun onInputASent(input: CharSequence) {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragB : FragmentB = fragmentManager.findFragmentById(R.id.container_b) as FragmentB
        fragB.updateEditTextB(input)
    }

    override fun onInputBSent(input: CharSequence) {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragA : FragmentA = fragmentManager.findFragmentById(R.id.container_a) as FragmentA
        fragA.updateEditTextA(input)
    }
}