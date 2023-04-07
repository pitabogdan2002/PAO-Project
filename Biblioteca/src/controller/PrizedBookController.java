package controller;

import model.Book.PrizedBook;
import model.Book.SeriesBook;
import model.autor.Author;
import service.PrizedBookService;
import service.SeriesBookService;

import java.util.ArrayList;

public class PrizedBookController {
    private PrizedBookService prizedBookService;
    public PrizedBookController() {  this.prizedBookService = new PrizedBookService();
    }

    public PrizedBook addBook(Author author)
    {
        PrizedBook book = prizedBookService.addBook(author);
        System.out.println("Cartea premiata a fost adaugata cu succes");
        return book;
    }

    public PrizedBook getBook(int idx)
    {
        PrizedBook book = prizedBookService.getBook(idx);
        return book;
    }

    public ArrayList<PrizedBook> getAll()
    {
        return prizedBookService.getAll();
    }

    public boolean delete(int idx)
    {
        return prizedBookService.delete(idx);
    }
}
