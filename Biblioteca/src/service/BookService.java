package service;

import model.autor.Author;
import repository.AuthorRepository;
import repository.BookRepository;
import model.Book.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public BookService() {
        this.bookRepository = new BookRepository();
        this.authorRepository = new AuthorRepository();
    }

    public Book addBook(Author author) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the book.");
        String title = scanner.nextLine();
        System.out.println("Please enter the genre of the book.");
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
        Book book = new Book(pageNumber, title, author, genre, assurance, exemplare, rating);
        Book result = bookRepository.add(book);
        return result;
    }

    public Book getBook(int idx) {
        Book book = bookRepository.get(idx);
        return book;
    }

    public ArrayList<Book> getAll()
    {
        return bookRepository.getAll();
    }
    public boolean update(Book book, float assurance) {

        bookRepository.update(book,assurance);
        return true;
    }

    public boolean delete(int idx)
    {
        if(bookRepository.delete(idx))
            return true;
        return false;
    }
    public boolean numberOfBooks()
    {
        if(bookRepository.numberOfBooks())
            return true;
        return false;
    }

}
