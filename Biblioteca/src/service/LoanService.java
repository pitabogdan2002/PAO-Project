package service;

import model.Book.Book;
import model.Client.Client;
import model.Date.Date;
import model.Loan.Loan;
import model.autor.Author;
import repository.AuthorRepository;
import repository.BookRepository;
import repository.LoanRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class LoanService {


    private BookRepository bookRepository;
    private LoanRepository loanRepository;

    public LoanService() {
        this.loanRepository = new LoanRepository();

    }

    public Loan addLoan(Client client, Date loanedDate, Date returnedDate, ArrayList<Book> books ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter if the loan was returned (true/false).");
        Boolean returned = Boolean.valueOf(scanner.nextLine());
        int numberOfBooks = books.size();
        Loan loan = new Loan(returned,client,loanedDate,returnedDate,numberOfBooks,books);
        Loan result = loanRepository.add(loan);
        return result;
    }

    public Loan getLoan(int idx) {
        Loan loan = loanRepository.get(idx);
        return loan;
    }

    public ArrayList<Loan> getAll()
    {
        return loanRepository.getAll();
    }
    public boolean update(Loan loan, boolean returned) {

        loanRepository.update(loan,returned);
        return true;
    }

    public boolean delete(int idx)
    {
        if(loanRepository.delete(idx))
            return true;
        return false;
    }
    public boolean tipImprumut(int idx)
    {
        if(loanRepository.tipImprumut(idx))
            return true;
        return false;
    }
    public boolean loanAuthors(int idx)
    {
        if(loanRepository.loanAuthors(idx))
            return true;
        return false;
    }

    public boolean longestBook(int idx)
    {
        if(loanRepository.longestBook(idx))
            return true;
        return false;
    }
}
