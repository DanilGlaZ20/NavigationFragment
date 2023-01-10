package com.example.navigationfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.navigationfragment.MAIN
import com.example.navigationfragment.R
import com.example.navigationfragment.databinding.FragmentMainBinding

import com.example.navigationfragment.databinding.FragmentPaymentBinding


class PaymentFragment : Fragment() {

    lateinit var binding: FragmentPaymentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentPaymentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // binding.give.setOnClickListener{ MAIN.navController.navigate(R.id.action_paymentFragment_to_transferFragment)}

    }


}








