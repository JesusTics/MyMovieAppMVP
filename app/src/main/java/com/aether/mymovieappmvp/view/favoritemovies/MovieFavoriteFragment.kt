package com.aether.mymovieappmvp.view.favoritemovies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.aether.mymovieappmvp.R
import com.aether.mymovieappmvp.databinding.FragmentMovieFavoriteBinding

class MovieFavoriteFragment : Fragment(R.layout.fragment_movie_favorite) {

    private lateinit var binding : FragmentMovieFavoriteBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieFavoriteBinding.bind(view)
    }
}