package service;

import model.Book.Book;
import model.autor.Author;
import repository.AuthorRepository;
import repository.BookRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService() {
        this.authorRepository = new AuthorRepository();
    }

    public Author addAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the firstName of the author.");
        String firstName = scanner.nextLine();
        System.out.println("Please enter the lastName of the author.");
        String lastName = scanner.nextLine();
        System.out.println("Please enter if the author is alive or not (true/false).");
        Boolean alive = Boolean.valueOf(scanner.nextLine());
        System.out.println("Please enter number of books by the author.");
        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        Author author = new Author(firstName,lastName,alive,numberOfBooks);
        Author result = authorRepository.add(author);
        return result;
    }

    public Author getAuthor(int idx) {
        Author author = authorRepository.get(idx);
        return author;
    }

    public ArrayList<Author> getAll()
    {
        return authorRepository.getAll();
    }
    public boolean update(Author author, Boolean alive) {
        authorRepository.update(author,alive);
        return true;
    }
    public boolean delete(int idx)
    {
        if(authorRepository.delete(idx))
            return true;
        return false;
    }
    public boolean consacrat(int idx)
    {
        if(authorRepository.consacrat(idx))
            return true;
        return false;
    }
}
