package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.entity.Movie;
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
        movieController.addUsingConsole();
    }
}
