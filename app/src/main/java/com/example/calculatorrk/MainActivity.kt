package com.example.calculatorrk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorrk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ButtonsFragment.ButtonsListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun numberClick(num: String) {
        var Display= supportFragmentManager.findFragmentById(R.id.displayfragment) as DisplayFragment
        Display.displaynumbers(num)
    }
}