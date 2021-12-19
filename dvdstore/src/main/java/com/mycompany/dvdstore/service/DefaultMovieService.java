package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.FileMovieRepository;


public class DefaultMovieService implements MovieServiceInterface {

    private FileMovieRepository goLiveMovieRepository = new FileMovieRepository();

    public FileMovieRepository getGoLiveMovieRepository() {
        return goLiveMovieRepository;
    }

    public void setGoLiveMovieRepository(FileMovieRepository goLiveMovieRepository) {
        this.goLiveMovieRepository = goLiveMovieRepository;
    }

    public void registerMovie(Movie movie) {
        goLiveMovieRepository.add(movie);
    }
}
