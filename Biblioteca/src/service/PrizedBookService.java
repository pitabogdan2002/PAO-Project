package service;

import model.Book.PrizedBook;
import model.Book.SeriesBook;
import model.autor.Author;
import repository.PrizedBookRepository;
import repository.SeriesBookRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class PrizedBookService {

    private PrizedBookRepository prizedBookRepository;


    public PrizedBookService() {
        this.prizedBookRepository = new PrizedBookRepository();
    }

    public PrizedBook addBook(Author author) {
        ArrayList<String> acolades = new ArrayList<String>();
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
        System.out.println("Please enter the number of the acloades received by the book ");
        int numberOfAcolades = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<numberOfAcolades; i++)
        {
            System.out.println("Please enter the genreof the author.");
            String prize = scanner.nextLine();
            acolades.add(prize);
        }

        PrizedBook book = new PrizedBook(pageNumber, title, author, genre, assurance, exemplare, rating,numberOfAcolades,acolades);
        PrizedBook result = prizedBookRepository.add(book);
        return result;
    }

    public PrizedBook getBook(int idx) {
        PrizedBook book = prizedBookRepository.get(idx);
        return book;
    }

    public ArrayList< PrizedBook> getAll()
    {
        return  prizedBookRepository.getAll();
    }
    public boolean update( PrizedBook book, float assurance) {

        prizedBookRepository.update(book,assurance);
        return true;
    }

    public boolean delete(int idx)
    {
        if(prizedBookRepository.delete(idx))
            return true;
        return false;
    }
}
