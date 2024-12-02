package com.example.final4ex_secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.final4ex_secretmessage.databinding.FragmentEncryptBinding


class EncryptFragment : Fragment() {
    private lateinit var bindingFragEncrypt: FragmentEncryptBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFragEncrypt = FragmentEncryptBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return bindingFragEncrypt.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rxMessage: String = EncryptFragmentArgs.fromBundle(requireArguments()).message
        val reversedMessage = rxMessage.reversed()

        // 뒤집힌 메시지 표시
        bindingFragEncrypt.encryptedMessage.setText(reversedMessage)

        // "START ANOTHER FRAG" 버튼 클릭 리스너 추가
        bindingFragEncrypt.btnStartAnotherFrag.setOnClickListener {
            val action = EncryptFragmentDirections.actionEncryptFragmentToAnotherFragment(reversedMessage)
            findNavController().navigate(action)
        }
    }
}