package com.example.final3ex_commbetweenfragment_project10_1

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.final3ex_commbetweenfragment_project10_1.databinding.FragmentBBinding

class FragmentB : Fragment() {
    private lateinit var bindingFragB: FragmentBBinding
    private lateinit var listener: FragmentBListener

    public interface FragmentBListener{
        fun onInputBSent(input: CharSequence)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentBListener){
            listener = context
        } else{
            throw RuntimeException("$context must implement FragmentBLisntener")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFragB = FragmentBBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return bindingFragB.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingFragB.buttonOk.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                listener.onInputBSent(bindingFragB.editText.text)
            }
        })
    }

    fun updateEditTextB(newText: CharSequence){
        bindingFragB.editText.setText(newText)
    }
}