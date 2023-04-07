package service;

import model.Book.Book;
import model.Book.SeriesBook;
import model.autor.Author;
import repository.AuthorRepository;
import repository.BookRepository;
import repository.SeriesBookRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class SeriesBookService {


    private SeriesBookRepository seriesBookRepository;


    public SeriesBookService() {
        this.seriesBookRepository = new SeriesBookRepository();
    }

    public SeriesBook addBook(Author author) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the book.");
        String title = scanner.nextLine();
        System.out.println("Please enter the genreof the author.");
        String genre = scanner.nextLine();
        System.out.println("Please enter if the author is alive or not (true/false).");
        Boolean alive = Boolean.valueOf(scanner.nextLine());
        System.out.println("Please enter number of pages of the book.");
        int pageNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter assurance tax of the book.");
        float assurance = Float.parseFloat(scanner.nextLine());
        System.out.println("Please enter number of books of this kind.");
        int exemplare = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the rating of the book out of 5.");
        double rating = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the name of the series.");
        String seriesName = scanner.nextLine();
        System.out.println("Please enter the number of the book in the series.");
        int bookNumber = Integer.parseInt(scanner.nextLine());

        SeriesBook book = new SeriesBook(pageNumber, title, author, genre, assurance, exemplare, rating,seriesName,bookNumber);
        SeriesBook result = seriesBookRepository.add(book);
        return result;
    }

    public SeriesBook getBook(int idx) {
        SeriesBook book = seriesBookRepository.get(idx);
        return book;
    }

    public ArrayList<SeriesBook> getAll()
    {
        return seriesBookRepository.getAll();
    }
    public boolean update(SeriesBook book, float assurance) {

        seriesBookRepository.update(book,assurance);
        return true;
    }

    public boolean delete(int idx)
    {
        if(seriesBookRepository.delete(idx))
            return true;
        return false;
    }


}
