package com.example.final6ex_catchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.final6ex_catchat2_navigationdrawer.databinding.FragmentHelpBinding

class HelpFragment : Fragment() {
    private lateinit var bindingFragHelp: FragmentHelpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFragHelp = FragmentHelpBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Binding 초기화
        bindingFragHelp = FragmentHelpBinding.inflate(inflater, container, false)
        return bindingFragHelp.root
    }


}