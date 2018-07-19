package com.portfolio_kot.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.portfolio_kot.R


class GetTouchFRagment : Fragment() {

    companion object {

        fun gettouchFragobj() : GetTouchFRagment{

            return GetTouchFRagment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.gettouch_layout,container,false)

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}