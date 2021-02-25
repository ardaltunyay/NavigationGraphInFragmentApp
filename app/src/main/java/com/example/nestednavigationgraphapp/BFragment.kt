package com.example.nestednavigationgraphapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton

class BFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navHostFragment = childFragmentManager.findFragmentById(R.id.flBContainer) as? NavHostFragment

        val navController = navHostFragment?.findNavController()

        view.findViewById<MaterialButton>(R.id.btnB1).setOnClickListener {
            navController?.navigate(R.id.b1Fragment)
        }

        view.findViewById<MaterialButton>(R.id.btnB2).setOnClickListener {
            navController?.navigate(R.id.b2Fragment)
        }

    }
}