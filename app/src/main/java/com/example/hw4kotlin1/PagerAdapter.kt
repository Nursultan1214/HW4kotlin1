package com.example.hw4kotlin1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return FirstFragment()
            1 -> return SecondFragment()
            2 -> return ThirdFragment()
        }
        return FirstFragment()
    }
}