package com.example.final4ex_secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.final4ex_secretmessage.databinding.FragmentMessageBinding
import com.example.final4ex_secretmessage.databinding.FragmentWelcomeBinding


class MessageFragment : Fragment() {
    private lateinit var bindingFragMessage: FragmentMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFragMessage = FragmentMessageBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return bindingFragMessage.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingFragMessage.btnNext.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val navController: NavController = Navigation.findNavController(view)
                val txMessage: String = bindingFragMessage.edtMessage.text.toString()
                val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(txMessage)
                navController.navigate(action)
            }
        })
    }
}