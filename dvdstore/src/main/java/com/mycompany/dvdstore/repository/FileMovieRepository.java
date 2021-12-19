package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface{

    @Value("${file}")
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
            System.out.println("Le film " + movie.getTitle() + " a été rajouté avec succès au fichier csv.");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
