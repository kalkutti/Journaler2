package com.mix.journaler2.fragment

import com.mix.journaler2.R

class MainFragment : BaseFragment() {

    override fun getLayout() = R.layout.fragment_main

    companion object {
        fun newInstance() = MainFragment()
    }
}