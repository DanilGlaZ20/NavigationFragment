package com.example.navigationfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.navigationfragment.R
import com.example.navigationfragment.databinding.FragmentHistory2Binding


    class HistoryFragment : Fragment() {

        lateinit var binding: FragmentHistory2Binding
        val catNames = arrayOf(
            "Рыжик", "Барсик", "Мурзик",
            "Мурка", "Васька", "Томасина", "Кристина", "Пушок", "Дымка",
            "Кузя", "Китти", "Масяня", "Симба"
        )
        //override fun onActivityCreated(savedInstanceState: Bundle?) { super.onActivityCreated(savedInstanceState) val adapter: ArrayAdapter<Any?>? = (activity?.let { ArrayAdapter<Any?>(it, android.R.layout.simple_list_item_1, catNames) }) }
        /*override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            val listView = view?.findViewById<ListView>(R.id.listView)*/


            /*override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)*/
         /*   val adapter: ListAdapter =
                ArrayAdapter<Any?>(requireActivity(), android.R.layout.simple_list_item_1, catNames)*/
            /*listView?.setAdapter(adapter)*/

// используем адаптер данных
        /* val adapter =
             ArrayAdapter<ListAdapter>(this, android.R.layout.simple_list_item_1, catNames);
         listView?.setAdapter(adapter); }*/




        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val callback = object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    findNavController().navigate(R.id.action_historyFragment_to_mainFragment)
                }
            }
            requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
            //return inflater.inflate(layoutInflater, container, false)
            binding = FragmentHistory2Binding.inflate(layoutInflater, container, false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)


        }



    }