import controller.*;
import model.Book.Book;
import model.Book.PrizedBook;
import model.Book.SeriesBook;
import model.Client.Client;
import model.Date.Date;
import model.Loan.Loan;
import model.autor.Author;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookController bc = new BookController();
        AuthorController ac = new AuthorController();
        ClientController cc = new ClientController();
        LoanController lc = new LoanController();
        DateController dc = new DateController();
        SeriesBookController sbc = new SeriesBookController();
        PrizedBookController pbc = new PrizedBookController();
        System.out.println("Library ");
        Scanner sc = new Scanner(System.in);
        String option;

        do {
            System.out.println("\nInsert option: \"1\": Add book; \"2\": Add author; \"3\": Update author; \"4\": Delete author; " +
                    "  \"5\": Check type of author;  \"6\": Add client;  \"7\": Show sum of all taxes paid by a client; \n\"8\": Add Loan; \"9\":type of loan; " +
                    "\"10\": number of different authors and their names from a loan; \"11\": Number of fantasy books registered; " +
                    "\"12\": Details about longest book in a loan; \n\"13\": Check if client is retired; \"14\": Add Series Book; \"15\": Add prized book; " );
            option = sc.nextLine();
            System.out.println("You inserted: " + option);


            if (Integer.parseInt(option) == 1) {

                Author aut = ac.addAuthor();
                Book book = bc.addBook(aut);
                System.out.println(book);

            } else if (Integer.parseInt(option) == 2) {
                Author aut = ac.addAuthor();
                System.out.println(aut);
            } else if (Integer.parseInt(option) == 3) {
                System.out.println("Please enter the index of the author to be updated.");
                int index = Integer.parseInt(sc.nextLine());
                Author aut = ac.getAuthor(index);
                ac.update(aut, false);
                System.out.println(aut);
            } else if (Integer.parseInt(option) == 4) {
                System.out.println("Please enter the index of the author to be deleted.");
                int index = Integer.parseInt(sc.nextLine());
                ac.delete(index);
            } else if (Integer.parseInt(option) == 5) {
                System.out.println("Please enter the index of the author.");
                int index = Integer.parseInt(sc.nextLine());
                ac.consacrat(index);
            } else if (Integer.parseInt(option) == 6) {

                Client cl = cc.addClient();
                System.out.println(cl);

            } else if (Integer.parseInt(option) == 7) {
                System.out.println("Please enter the index of the client.");

                int index = Integer.parseInt(sc.nextLine());
                cc.sumaTotalaPlatita(index);

            } else if (Integer.parseInt(option) == 8) {
                Client c = cc.addClient();
                Date d1 = dc.addDate();
                Date d2 = dc.addDate();
                ArrayList<Book> list = new ArrayList<Book>();
                System.out.println("Please enter the number of normal books");
                int nrBooks= Integer.parseInt(sc.nextLine());
                System.out.println("Please enter the number of series books.");
                int nrSeriesBooks= Integer.parseInt(sc.nextLine());
                System.out.println("Please enter the number of prized books.");
                int nrPrizedBooks= Integer.parseInt(sc.nextLine());
                for(int i=1; i<=nrBooks; i++)
                {
                    System.out.println("Please enter the index of normal book.");
                    int index =Integer.parseInt(sc.nextLine());
                    list.add(bc.getBook(index));
                }
                for(int i=1; i<=nrSeriesBooks; i++)
                {
                    System.out.println("Please enter the index of series books.");
                    int index =Integer.parseInt(sc.nextLine());
                    list.add(sbc.getBook(index));
                }
                for(int i=1; i<=nrPrizedBooks; i++)
                {
                    System.out.println("Please enter the index of prized books.");
                    int index =Integer.parseInt(sc.nextLine());
                    list.add(pbc.getBook(index));
                }
                Loan loan = lc.addLoan(c, d1, d2, list);
                System.out.println(loan);

            } else if (Integer.parseInt(option) == 9)
            {
                System.out.println("Please enter the index of the loan.");
                int index = Integer.parseInt(sc.nextLine());
                lc.tipImprumut(index);
            }
            else if (Integer.parseInt(option) == 10)
            {
                System.out.println("Please enter the index of the loan.");
                int index = Integer.parseInt(sc.nextLine());
                lc.loanAuthors(index);
            }
            else if (Integer.parseInt(option) == 11) {
                System.out.println("Please enter the index of the book.");
                bc.numberOfBooks();
            }
            else if (Integer.parseInt(option) == 12) {
                System.out.println("Please enter the index of the loan.");
                int index = Integer.parseInt(sc.nextLine());
                lc.longestBook(index);
            }
            else if (Integer.parseInt(option) == 13) {
                System.out.println("Please enter the index of the client.");
                int index = Integer.parseInt(sc.nextLine());
                cc.checkRetired(index);
            }
            else  if (Integer.parseInt(option) == 14) {

                Author aut = ac.addAuthor();
                SeriesBook book = sbc.addBook(aut);
                System.out.println(book);

            }
            else  if (Integer.parseInt(option) == 15) {

                Author aut = ac.addAuthor();
                PrizedBook book = pbc.addBook(aut);
                System.out.println(book);

            }



        } while (!option.equals("stop"));
        sc.close();
    }
}