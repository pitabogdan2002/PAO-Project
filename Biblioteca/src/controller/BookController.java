package controller;

import model.Book.Book;
import model.autor.Author;
import service.BookService;

import java.util.ArrayList;

public class BookController {

    private BookService bookService;
    public BookController() {
        this.bookService = new BookService();
    }

    public Book addBook(Author author)
    {
        Book book = bookService.addBook(author);
        System.out.println("Cartea a fost adaugata cu succes");
        return book;
    }

    public Book getBook(int idx)
    {
        Book book = bookService.getBook(idx);
        return book;
    }

    public ArrayList<Book> getAll()
    {
        return bookService.getAll();
    }

    public boolean delete(int idx)
    {
        return bookService.delete(idx);
    }
    public boolean numberOfBooks()
    {
        return bookService.numberOfBooks();
    }
}
