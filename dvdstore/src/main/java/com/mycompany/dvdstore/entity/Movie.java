package com.mycompany.dvdstore.entity;

public class Movie {

    public String title;
    public String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
}
