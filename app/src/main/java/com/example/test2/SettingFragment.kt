package com.example.test2


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class SettingFragment : Fragment() {


        private lateinit var button1: Button
        private lateinit var button2: Button

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_setting, container, false)


            button1 = view.findViewById(R.id.button1)
            button2 = view.findViewById(R.id.button2)

            button1.setOnClickListener {

            }

            button2.setOnClickListener {

            }

            return view
        }
    }

