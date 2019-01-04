package com.example.alizee.navigationtest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_even.*

class FragmentOdd : Fragment() {
    private var id: Int? = null
    private var name: String? = null
    private var message: String? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_odd, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            id = FragmentOddArgs.fromBundle(it).id
            name = FragmentOddArgs.fromBundle(it).name
            message = FragmentOddArgs.fromBundle(it).message

            result.text = "Id: $id, Name: $name, Message: $message"
        }
    }
}