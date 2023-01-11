package com.example.navigationfragment.fragments

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationfragment.R
import com.example.navigationfragment.databinding.FragmentTransferBinding
import android.os.Bundle
import android.widget.ImageButton
import androidx.core.app.BundleCompat

class TransferFragment : Fragment() {

    lateinit var binding: FragmentTransferBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? { binding= FragmentTransferBinding.inflate(layoutInflater, container, false)
        return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val btn  = view.findViewById<Button>(R.id.yes)
            val editTextPrice  = view.findViewById<EditText>(R.id.editTextPrice)
            val editTextPhone=view.findViewById<EditText>(R.id.editTextNumber)
             val bundle = Bundle()

            btn.setOnClickListener {
                val price = editTextPrice.text
                val phone=editTextPhone.text
                val number = "Номер получателя:$phone\nСумма для отправления:$price"
                bundle.putString("Num", number)
                findNavController().navigate(R.id.action_transferFragment_to_confirmFragment, bundle)
            }
    }



}


