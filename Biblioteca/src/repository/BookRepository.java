package repository;

import model.Book.Book;
import model.autor.Author;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
public class BookRepository {

    ArrayList <Book> booksList = new ArrayList <Book>();

    public Book add(Book book) {
        booksList.add(book);
        System.out.println(booksList);
        return book;
    }

    public Book get(int index) {
        if(index< booksList.size())
        return booksList.get(index);
        return null;
    }

    public  ArrayList <Book> getAll() {
        return booksList;
    }

    public boolean update(Book book, float assurance) {

        book.setAssurance(assurance);
        return true;
    }

    public boolean delete(int index) {
        if(index< booksList.size())
        {
            booksList.remove(index);
            return true;
        }
        return false;
    }

    public boolean numberOfBooks() {
        int contor = 0;
        for(int i=0; i<booksList.size(); i++)
            if(booksList.get(i).getGenre().toUpperCase()=="fantasy".toUpperCase())
                contor++;
        System.out.println(contor);
        return true;
    }
}
