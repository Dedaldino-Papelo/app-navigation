package com.example.android_trivia_navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android_trivia_navigation.databinding.FragmentGameWonBinding

class GameWonFragment: Fragment() {
    private lateinit var binding: FragmentGameWonBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate<FragmentGameWonBinding>(inflater, R.layout.fragment_game_won, container, false)

        binding.nextMatchButton.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_gameWonFragment_to_gameFragment)
        }

        return binding.root
    }
}