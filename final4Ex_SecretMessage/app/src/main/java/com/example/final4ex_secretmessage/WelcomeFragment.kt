package com.example.final4ex_secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.final4ex_secretmessage.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {
    private lateinit var bindingFragWelcome: FragmentWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFragWelcome = FragmentWelcomeBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return bindingFragWelcome.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingFragWelcome.btnStart.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val navController: NavController = Navigation.findNavController(view)
                navController.navigate(R.id.action_welcomeFragment_to_messageFragment)
            }
        })
    }

}