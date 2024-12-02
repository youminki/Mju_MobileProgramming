package com.example.final3ex_commbetweenfragment_project10_1

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.final3ex_commbetweenfragment_project10_1.databinding.FragmentABinding

class FragmentA : Fragment() {
    private lateinit var bindingFragA: FragmentABinding
    private lateinit var listener: FragmentAListener

    public interface FragmentAListener{
        fun onInputASent(input: CharSequence)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentAListener){
            listener = context
        } else{
            throw RuntimeException("$context must implement FragmentALisntener")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFragA = FragmentABinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return bindingFragA.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingFragA.buttonOk.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                listener.onInputASent(bindingFragA.editText.text)
            }
        })
    }

    fun updateEditTextA(newText: CharSequence){
        bindingFragA.editText.setText(newText)
    }
}