package com.aether.mymovieappmvp.data

import com.aether.mymovieappmvp.data.model.DataSource
import com.aether.mymovieappmvp.data.model.MovieList

class RepositoryImpl(private val dataSource:DataSource):Repository {

    override suspend fun getMovies(): MovieList = dataSource.getMovies()
}