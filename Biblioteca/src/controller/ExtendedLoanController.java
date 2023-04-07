package controller;

import model.Book.Book;
import model.Client.Client;
import model.Date.Date;
import model.Loan.ExtendedLoan;

import service.ExtendedLoanService;
import service.LoanService;

import java.util.ArrayList;

public class ExtendedLoanController {



    private ExtendedLoanService extendedLoanService;
    public ExtendedLoanController() {
        ExtendedLoanService extendedloanService = new ExtendedLoanService();
    }

    public ExtendedLoan addLoan(Client client, Date loanedDate, Date returnedDate, ArrayList<Book> books)
    {
        ExtendedLoan loan = extendedLoanService.addLoan(client, loanedDate, returnedDate, books);
        System.out.println("Cartea a fost adaugata cu succes");
        return loan;
    }

    public ExtendedLoan getLoan(int idx)
    {
        ExtendedLoan loan = extendedLoanService.getLoan(idx);
        return loan;
    }

    public ArrayList<ExtendedLoan> getAll()
    {
        return extendedLoanService.getAll();
    }

    public boolean delete(int idx)
    {
        return extendedLoanService.delete(idx);
    }
}
