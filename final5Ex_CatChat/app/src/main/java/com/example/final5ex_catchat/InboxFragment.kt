package com.example.final5ex_catchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.final5ex_catchat.databinding.FragmentInboxBinding

class InboxFragment : Fragment() {
    private lateinit var bindingFragInbox: FragmentInboxBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Binding 초기화
        bindingFragInbox = FragmentInboxBinding.inflate(inflater, container, false)
        return bindingFragInbox.root
    }
}
