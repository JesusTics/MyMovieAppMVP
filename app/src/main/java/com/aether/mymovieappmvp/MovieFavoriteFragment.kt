package com.aether.mymovieappmvp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aether.mymovieappmvp.databinding.FragmentMovieFavoriteBinding
import com.aether.mymovieappmvp.databinding.FragmentMovieMainBinding

class MovieFavoriteFragment : Fragment(R.layout.fragment_movie_favorite) {

    private lateinit var binding : FragmentMovieFavoriteBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieFavoriteBinding.bind(view)
    }
}