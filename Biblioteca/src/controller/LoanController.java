package controller;

import model.Book.Book;
import model.Client.Client;
import model.Date.Date;
import model.Loan.Loan;
import model.autor.Author;
import service.BookService;
import service.LoanService;

import java.util.ArrayList;

public class LoanController {



    private LoanService loanService;
    public LoanController() {
        this.loanService = new LoanService();
    }

    public Loan addLoan(Client client, Date loanedDate, Date returnedDate, ArrayList<Book> books)
    {
        Loan loan = loanService.addLoan(client, loanedDate, returnedDate, books);
        System.out.println("Cartea a fost adaugata cu succes");
        return loan;
    }

    public Loan getLoan(int idx)
    {
        Loan loan = loanService.getLoan(idx);
        return loan;
    }

    public ArrayList<Loan> getAll()
    {
        return loanService.getAll();
    }

    public boolean delete(int idx)
    {
        return loanService.delete(idx);
    }

    public boolean tipImprumut(int idx)
    {
        return loanService.tipImprumut(idx);
    }

    public boolean loanAuthors(int idx)
    {
        return loanService.loanAuthors(idx);
    }
    public boolean longestBook(int idx)
    {
        return loanService.longestBook(idx);
    }
}
