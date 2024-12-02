package com.example.final5ex_catchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.final5ex_catchat.databinding.FragmentSentItemsBinding

class SentItemsFragment : Fragment() {
    private lateinit var bindingFragmentSentItems: FragmentSentItemsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFragmentSentItems = FragmentSentItemsBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return bindingFragmentSentItems.root
    }
}