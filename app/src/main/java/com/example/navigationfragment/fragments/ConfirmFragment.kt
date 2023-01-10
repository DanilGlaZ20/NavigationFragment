package com.example.navigationfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.navigationfragment.R
import com.example.navigationfragment.databinding.FragmentConfirmBinding
import com.example.navigationfragment.databinding.FragmentTransferBinding


class ConfirmFragment : Fragment() {



    lateinit var binding:FragmentConfirmBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_confirmFragment_to_mainFragment)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
        binding= FragmentConfirmBinding.inflate(layoutInflater, container, false)
        return binding.root
        // return inflater.inflate(R.layout.fragment_transfer,container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val txt=view.findViewById<TextView>(R.id.textFragment)
        val text=arguments?.getString("Num")
        txt.text=text
    }


    }