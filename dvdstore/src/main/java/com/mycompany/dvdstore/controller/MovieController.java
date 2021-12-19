package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole() {
         Scanner sc = new Scanner(System.in);
         System.out.println( "Titre ?" );
         String title = sc.nextLine();
         System.out.println("Genre ?");
         String genre = sc.nextLine();

         Movie movie = new Movie(title, genre);
         movieService.registerMovie(movie);

     }
}
