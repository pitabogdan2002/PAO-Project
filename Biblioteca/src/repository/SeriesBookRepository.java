package repository;

import model.Book.SeriesBook;

import java.util.ArrayList;

public class SeriesBookRepository {
    ArrayList<SeriesBook> seriesBooksList = new ArrayList <SeriesBook>();

    public SeriesBook add(SeriesBook book) {
        seriesBooksList.add(book);
        System.out.println( seriesBooksList);
        return book;
    }

    public SeriesBook get(int index) {
        if(index<  seriesBooksList.size())
            return  seriesBooksList.get(index);
        return null;
    }

    public  ArrayList <SeriesBook> getAll() {
        return  seriesBooksList;
    }

    public boolean update(SeriesBook book, float assurance) {

        book.setAssurance(assurance);
        return true;
    }

    public boolean delete(int index) {
        if(index<  seriesBooksList.size())
        {
            seriesBooksList.remove(index);
            return true;
        }
        return false;
    }
}
