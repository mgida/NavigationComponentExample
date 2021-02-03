package com.example.navigationcomponentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationcomponentexample.databinding.FragmentFirstBinding
import com.example.navigationcomponentexample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSecondBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)
        val args = SecondFragmentArgs.fromBundle(arguments!!)

        binding.userInSecondFragTextView.text = "Hello ${args.userName}"
        binding.buttonPickSecond.setOnClickListener { view ->
            view.findNavController()
                .navigate(SecondFragmentDirections.actionSecondFragmentToPickFragment())
        }
        return binding.root
    }
}