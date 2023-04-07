package repository;

import model.Loan.ExtendedLoan;
import model.Loan.Loan;

import java.util.ArrayList;

public class ExtendedLoanRepository {


    ArrayList<ExtendedLoan> extendedLoansList = new ArrayList <ExtendedLoan>();

    public ExtendedLoan add(ExtendedLoan loan) {
        extendedLoansList.add(loan);
        System.out.println(extendedLoansList);
        return loan;
    }

    public ExtendedLoan get(int index) {
        if(index< extendedLoansList.size())
            return extendedLoansList.get(index);
        return null;
    }

    public  ArrayList <ExtendedLoan> getAll() {
        return extendedLoansList;
    }

    public boolean update(ExtendedLoan loan, boolean returned) {

        loan.setReturned(returned);
        return true;
    }

    public boolean delete(int index) {
        if(index< extendedLoansList.size())
        {
            extendedLoansList.remove(index);
            return true;
        }
        return false;
    }
}
