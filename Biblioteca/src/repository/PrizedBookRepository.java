package repository;

import model.Book.PrizedBook;
import model.Book.SeriesBook;

import java.util.ArrayList;

public class PrizedBookRepository {

    ArrayList<PrizedBook> prizedBooksList = new ArrayList <PrizedBook>();

    public PrizedBook add(PrizedBook book) {
        prizedBooksList.add(book);
        System.out.println(prizedBooksList);
        return book;
    }

    public PrizedBook get(int index) {
        if(index<  prizedBooksList.size())
            return  prizedBooksList.get(index);
        return null;
    }

    public  ArrayList <PrizedBook> getAll() {
        return  prizedBooksList;
    }

    public boolean update(PrizedBook book, float assurance) {

        book.setAssurance(assurance);
        return true;
    }

    public boolean delete(int index) {
        if(index<  prizedBooksList.size())
        {
            prizedBooksList.remove(index);
            return true;
        }
        return false;
    }
}
