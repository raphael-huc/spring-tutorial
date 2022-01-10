package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Exercice n°2 du cours
 *
 */
public class App 
{

    public static void main( String[] args )
    {

        // Méthode avec Spring, Injection avec conteneur léger Spring xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieController movieController = applicationContext.getBean(MovieController.class);

        movieController.addUsingConsole();


        // Ancienne méthode, injection de dépendance manuel
//        MovieController movieController = new MovieController();
//        DefaultMovieService defaultMovieService = new DefaultMovieService();
//        FileMovieRepository goLiveMovieRepository = new FileMovieRepository();
//        defaultMovieService.setGoLiveMovieRepository(goLiveMovieRepository);
//        movieController.setMovieService(defaultMovieService);
//        movieController.addUsingConsole();
    }
}
