package com.example.calculatorrk


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.calculatorrk.databinding.FragmentDisplayBinding


class DisplayFragment : Fragment() {
    private lateinit var binding: FragmentDisplayBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentDisplayBinding.inflate(inflater, container, false)

        return binding.root
    }
    fun displaynumbers(num: String){
        binding.displaybox.text=num

    }



}