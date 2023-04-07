package repository;

import model.Book.Book;
import model.Loan.Loan;
import model.autor.Author;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class LoanRepository {

    ArrayList<Loan> loansList = new ArrayList <Loan>();

    public Loan add(Loan loan) {
        loansList.add(loan);
        System.out.println(loansList);
        return loan;
    }

    public Loan get(int index) {
        if(index< loansList.size())
            return loansList.get(index);
        return null;
    }

    public  ArrayList <Loan> getAll() {
        return loansList;
    }

    public boolean update(Loan loan, boolean returned) {

        loan.setReturned(returned);
        return true;
    }

    public boolean delete(int index) {
        if(index< loansList.size())
        {
            loansList.remove(index);
            return true;
        }
        return false;
    }
    public boolean tipImprumut(int index) {
        if(index< loansList.size())
        {
            Loan l = loansList.get(index);
            int nr = l.getBooksNumber();
            if(nr>10)
                System.out.println("Imprumut mare");
            else
                System.out.println("Imprumut mic");
            return true;
        }
        return false;
    }

    public boolean loanAuthors(int index) {
        if(index< loansList.size())
        {
            ArrayList <Author> listaAutori = new ArrayList<Author>();
            Loan l = loansList.get(index);
            ArrayList <Book> list = l.getBooksList();
            for(int i=0; i<list.size(); i++)
            {
                Book b = list.get(i);
                if(listaAutori.contains(b.getAuthor())==false)
                    listaAutori.add(b.getAuthor());
            }
            System.out.println("Numar de autori: " + listaAutori.size());
            for(int i=0; i<listaAutori.size(); i++)
                System.out.println(listaAutori.get(i));
            return true;
        }
        return false;
    }

    public boolean longestBook(int index) {
        if(index< loansList.size())
        {
            Book max = new Book();
            Loan l = loansList.get(index);
            ArrayList <Book> list = l.getBooksList();
            for(int i=0; i<list.size(); i++)
            {
                if(list.get(i).getPageNumber()>max.getPageNumber()) {
                        max = list.get(i);
                }
            }
            System.out.println(max);
            return true;
        }
        return false;
    }
}
