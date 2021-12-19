package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;


public class MovieService implements MovieServiceInterface {

    private GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();

    public void registerMovie(Movie movie) {
        goLiveMovieRepository.add(movie);
    }
}
