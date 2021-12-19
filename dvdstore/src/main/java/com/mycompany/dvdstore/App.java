package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Exercice n°2 du cours
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        MovieService movieService = new MovieService();
        GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
        movieService.setGoLiveMovieRepository(goLiveMovieRepository);
        movieController.setMovieService(movieService);
        movieController.addUsingConsole();
    }
}
