package com.example.navigationcomponentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationcomponentexample.databinding.FragmentPickBinding

class PickFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentPickBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_pick, container, false)

        val userName = binding.nameEditText.text.toString()

        binding.buttonFirstFrag.setOnClickListener { view ->
            view.findNavController()
                .navigate(PickFragmentDirections.actionPickFragmentToFirstFragment(userName))
        }
        binding.buttonSecondFrag.setOnClickListener { view ->
            view.findNavController()
                .navigate(PickFragmentDirections.actionPickFragmentToSecondFragment(userName))
        }
        return binding.root
    }
}