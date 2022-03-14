package com.example.hw4kotlin1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.hw4kotlin1.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: HistoryAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentThirdBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        adapter = HistoryAdapter()
        viewModel.commands.observe(viewLifecycleOwner){
            adapter .setList(it)
        }
        binding.rvHistory.adapter = adapter

    }

}