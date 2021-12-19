package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FileMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;

/**
 * Exercice n°2 du cours
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        DefaultMovieService defaultMovieService = new DefaultMovieService();
        FileMovieRepository goLiveMovieRepository = new FileMovieRepository();
        defaultMovieService.setGoLiveMovieRepository(goLiveMovieRepository);
        movieController.setMovieService(defaultMovieService);
        movieController.addUsingConsole();
    }
}
