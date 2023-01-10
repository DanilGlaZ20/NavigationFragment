package com.example.navigationfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.example.navigationfragment.MAIN
import com.example.navigationfragment.R
import com.example.navigationfragment.databinding.ActivityMainBinding
import com.example.navigationfragment.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    lateinit var binding:FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.balance.setOnClickListener{MAIN.navController.navigate(R.id.action_mainFragment_to_balanceFragment)}
        binding.payment.setOnClickListener{MAIN.navController.navigate(R.id.action_mainFragment_to_paymentFragment)}
        binding.history.setOnClickListener{MAIN.navController.navigate(R.id.action_mainFragment_to_historyFragment)}
    }

}