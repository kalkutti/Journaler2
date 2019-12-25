package com.mix.journaler2.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mix.journaler2.CountrySeed
import com.mix.journaler2.R
import com.mix.tipsytab.CategAdapter
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment() {

    lateinit var countryRecycler: RecyclerView

    override fun getLayout() = R.layout.fragment_main

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here
        recyclercateg.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = CategAdapter(CountrySeed().seed())
        }
    }
}