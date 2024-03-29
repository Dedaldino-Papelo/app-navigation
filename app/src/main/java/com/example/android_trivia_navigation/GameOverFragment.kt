package com.example.android_trivia_navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android_trivia_navigation.databinding.FragmentGameOverBinding

class GameOverFragment: Fragment() {
    private lateinit var binding: FragmentGameOverBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate<FragmentGameOverBinding>(inflater,R.layout.fragment_game_over, container, false )

        binding.tryAgainButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_gameOverFragment_to_gameFragment)
        }

        return  binding.root
    }
}