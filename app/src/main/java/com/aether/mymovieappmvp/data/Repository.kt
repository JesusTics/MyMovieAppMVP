package com.aether.mymovieappmvp.data

import com.aether.mymovieappmvp.data.model.MovieList

interface Repository {
    suspend fun getMovies():MovieList
}