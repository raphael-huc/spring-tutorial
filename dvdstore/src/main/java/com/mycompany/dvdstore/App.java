package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan({"com.mycompany.dvdstore.controller","com.mycompany.dvdstore.service","com.mycompany.dvdstore.repository.file"})
@PropertySource("classpath:application.properties")
@ImportResource("classpath:applicationContext.xml")
public class App 
{

    public static void main( String[] args )
    {

        // Méthode avec Spring, Injection avec conteneur léger Spring xml
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Injection avec une classe @Configuration sans utiliser un ficher xml
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
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
