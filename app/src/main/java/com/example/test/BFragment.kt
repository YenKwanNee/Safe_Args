package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class BFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_b, container, false)

        val tvName = view.findViewById<TextView>(R.id.tvName)

//unsafe args passing
       /* val name = arguments?.getDouble("personName")
        tvName.text = name.toString()*/

        //safe args
        val args = BFragmentArgs.fromBundle(requireArguments())
        tvName.text = args.name

        return view
    }

}