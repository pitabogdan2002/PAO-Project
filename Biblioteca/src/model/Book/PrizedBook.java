package model.Book;

import model.autor.Author;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class PrizedBook extends Book {
    protected int numberOfAcolades;

    protected ArrayList<String> Acolades;

    public PrizedBook() {
    }

    public PrizedBook(int pageNumber, String title, Author author, String genre, float assurance, int exemplare, double rating, int numberOfAcolades, ArrayList<String> acolades) {
        super(pageNumber, title, author, genre, assurance, exemplare, rating);
        this.numberOfAcolades = numberOfAcolades;
        Acolades = acolades;
    }

    public int getNumberOfAcolades() {
        return numberOfAcolades;
    }

    public void setNumberOfAcolades(int numberOfAcolades) {
        this.numberOfAcolades = numberOfAcolades;
    }

    public void setAcolades(ArrayList<String> acolades) {
        Acolades = acolades;
    }

    public ArrayList<String> getAcolades() {
        return Acolades;
    }

    @Override
    public String toString() {
        return "PrizedBook{" +
                "numberOfAcolades=" + numberOfAcolades +
                ", Acolades=" + Acolades +
                ", pageNumber=" + pageNumber +
                ", title='" + title + '\'' +
                ", bookId=" + bookId +
                ", author=" + author +
                ", genre='" + genre + '\'' +
                ", assurance=" + assurance +
                ", exemplare=" + exemplare +
                ", rating=" + rating +
                '}';
    }
}
