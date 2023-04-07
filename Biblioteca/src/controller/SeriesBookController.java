package controller;

import model.Book.Book;
import model.Book.SeriesBook;
import model.autor.Author;
import service.BookService;
import service.SeriesBookService;

import java.util.ArrayList;

public class SeriesBookController {


    private SeriesBookService seriesBookService;
    public SeriesBookController() {
        this.seriesBookService = new SeriesBookService();
    }

    public SeriesBook addBook(Author author)
    {
        SeriesBook book = seriesBookService.addBook(author);
        System.out.println("Cartea de tip serie a fost adaugata cu succes");
        return book;
    }

    public SeriesBook getBook(int idx)
    {
        SeriesBook book = seriesBookService.getBook(idx);
        return book;
    }

    public ArrayList<SeriesBook> getAll()
    {
        return seriesBookService.getAll();
    }

    public boolean delete(int idx)
    {
        return seriesBookService.delete(idx);
    }
}
