package com.example.hw4kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.hw4kotlin1.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    val nameOfFragment: Array<String> = arrayOf("+ and -", "liveData", "History")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.vpMain.adapter = PagerAdapter(this)

        TabLayoutMediator(binding.tlMenu,binding.vpMain) { tab, position ->
            tab.text = nameOfFragment[position]
        }.attach()
    }
}