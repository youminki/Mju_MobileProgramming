package com.example.final4ex_secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.final4ex_secretmessage.databinding.FragmentAnotherBinding

class AnotherFragment : Fragment() {
    private lateinit var binding: FragmentAnotherBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentAnotherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 메시지 전달받아 화면에 표시
        val message = arguments?.getString("message") ?: "No message"
        binding.txtMessage.text = message
    }
}
