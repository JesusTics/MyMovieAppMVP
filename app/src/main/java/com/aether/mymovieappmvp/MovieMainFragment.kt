package com.aether.mymovieappmvp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aether.mymovieappmvp.databinding.FragmentMovieMainBinding

class MovieMainFragment : Fragment(R.layout.fragment_movie_main) {

    private lateinit var binding : FragmentMovieMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieMainBinding.bind(view)

    }
}