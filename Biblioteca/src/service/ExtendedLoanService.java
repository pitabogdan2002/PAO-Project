package service;

import model.Book.Book;
import model.Client.Client;
import model.Date.Date;
import model.Loan.ExtendedLoan;
import repository.BookRepository;
import repository.ExtendedLoanRepository;
import repository.LoanRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ExtendedLoanService {


    private BookRepository bookRepository;
    private ExtendedLoanRepository extendedLoanRepository;

    public ExtendedLoanService() {
        this.extendedLoanRepository = new ExtendedLoanRepository();

    }

    public ExtendedLoan addLoan(Client client, Date loanedDate, Date returnedDate, ArrayList<Book> books ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the tax.");
        int tax = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter number of days of extension. ");
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter if the loan was returned (true/false).");
        Boolean returned = Boolean.valueOf(scanner.nextLine());
        int numberOfBooks = books.size();
        ExtendedLoan loan = new ExtendedLoan(returned,client,loanedDate,returnedDate,numberOfBooks,books,tax,numberOfDays);
        ExtendedLoan result = extendedLoanRepository.add(loan);
        return result;
    }

    public ExtendedLoan getLoan(int idx) {
        ExtendedLoan loan = extendedLoanRepository.get(idx);
        return loan;
    }

    public ArrayList<ExtendedLoan> getAll()
    {
        return extendedLoanRepository.getAll();
    }
    public boolean update(ExtendedLoan loan, boolean returned) {

        extendedLoanRepository.update(loan,returned);
        return true;
    }

    public boolean delete(int idx)
    {
        if(extendedLoanRepository.delete(idx))
            return true;
        return false;
    }


}
