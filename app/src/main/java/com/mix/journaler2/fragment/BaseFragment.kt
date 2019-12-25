package com.mix.journaler2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mix.journaler2.R
import kotlinx.android.synthetic.main.activity_main.view.*

abstract class BaseFragment : Fragment() {

    var rootView: View? = null

    protected abstract fun getLayout(): Int

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rootView = inflater.inflate(R.layout.fragment_main, container, false)
        return inflater.inflate(getLayout(), container, false)
    }
}

