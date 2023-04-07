package service;

import model.Client.Client;
import repository.ClientRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientService {

    private ClientRepository clientRepository;

    public ClientService() {
        this.clientRepository = new ClientRepository();
    }

    public Client addClient() {
        ArrayList<Float> Taxes = new ArrayList<Float>();
        ArrayList<Integer> Loans = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the firstName of the Client.");
        String firstName = scanner.nextLine();
        System.out.println("Please enter the lastName of the Client.");
        String lastName = scanner.nextLine();
        System.out.println("Please enter the age of the Client.");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the gender of the Client.");
        String gender= scanner.nextLine();
        System.out.println("Please enter number of months for taxes");
        int monthsTaxes = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter number of months for loans.");
        int monthsLoans = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<monthsLoans; i++)
        {
            System.out.println("Please enter number of loans for the month.");
            int loan = Integer.parseInt(scanner.nextLine());
            Loans.add(loan);
        }

        for(int i=0; i<monthsTaxes; i++)
        {
            System.out.println("Please enter number of loans for the month.");
            float tax = Float.parseFloat(scanner.nextLine());
            Taxes.add(tax);
        }

        Client Client = new Client(firstName,lastName,age,gender,monthsTaxes,Taxes,monthsLoans,Loans);
        Client result = clientRepository.add(Client);
        return result;
    }

    public Client getClient(int idx) {
        Client client = clientRepository.get(idx);
        return client;
    }

    public ArrayList<Client> getAll()
    {
        return clientRepository.getAll();
    }
    public boolean update(Client Client, int age) {
        clientRepository.update(Client, age);
        return true;
    }
    public boolean delete(int idx)
    {
        if(clientRepository.delete(idx))
            return true;
        return false;
    }
    public boolean sumaTotalaPlatita(int idx)
    {
        if(clientRepository.sumaTotalaPlatita(idx))
            return true;
        return false;
    }

    public boolean checkRetired(int idx)
    {
        if(clientRepository.checkRetired(idx))
            return true;
        return false;
    }
}
