package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface{

    public List<Movie> movies = new ArrayList<Movie>();

    public void add (Movie movie) {
        movies.add(movie);
        System.out.println("Le film " + movie.getTitle() + " a été rajouté avec succès");
    }
}
