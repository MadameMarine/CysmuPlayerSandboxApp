package com.umbral.www.cysmuplayersandboxapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.umbral.www.cysmuplayersandboxapp.R
import com.umbral.www.cysmuplayersandboxapp.databinding.FragmentPlayerBinding

/**
 * Handle interface related code
 * Only calls methods from other file
 * */
class PlayerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPlayerBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_player,
            container,
            false
        )

        return binding.root
    }


}
