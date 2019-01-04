package com.example.alizee.navigationtest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment1.*

class Fragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment1, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            val id = id_input.text.toString()
            val name = name_input.text.toString()
            val message = message_input.text.toString()

            if (id != "") {
                if (id.toInt() % 2 == 0) {
                    val direction = Fragment1Directions.actionFragment1ToFragmentEven(id.toInt(), name)
                    if (message != "") {
                        direction.message = message
                    }
                    findNavController().navigate(direction)
                } else {
                    val direction = Fragment1Directions.actionFragment1ToFragmentOdd(id.toInt(), name)
                    if (message != "") {
                        direction.message = message
                    }
                    findNavController().navigate(direction)
                }
            }

        }
    }
}
