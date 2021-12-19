package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface{

    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void add (Movie movie) {
        FileWriter writer;
        try{
            writer=new FileWriter(file,true);
            writer.write( movie.getTitle() + ";" + movie.getGenre() + "\n");
            writer.close();
            System.out.println("Le film " + movie.getTitle() + " a été rajouté avec succès");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
