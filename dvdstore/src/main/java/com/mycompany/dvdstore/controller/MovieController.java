package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

    private MovieService movieService = new MovieService();

     public void addUsingConsole() {
         Scanner sc = new Scanner(System.in);
         System.out.println( "Titre ?" );
         String title = sc.nextLine();
         System.out.println("Genre ?");
         String genre = sc.nextLine();

         Movie movie = new Movie(title, genre);
         MovieService movieService = new MovieService();
         movieService.registerMovie(movie);
     }
}
