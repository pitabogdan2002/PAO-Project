package controller;

import model.Client.Client;
import service.ClientService;

import java.util.ArrayList;

public class ClientController {

    private ClientService clientService;
    public ClientController() {
        this.clientService = new ClientService();
    }

    public Client addClient()
    {
        Client client = clientService.addClient();
        System.out.println("Autorul a fost adaugat cu succes");
        return client;
    }

    public Client getClient(int idx)
    {
        Client client = clientService.getClient(idx);
        return client;
    }

    public ArrayList<Client> getAll()
    {
        return clientService.getAll();
    }
    public boolean update(Client Client, int age) {
        clientService.update(Client,age);
        return true;
    }

    public boolean delete(int idx)
    {
        return clientService.delete(idx);
    }

    public boolean sumaTotalaPlatita(int idx)
    {
        return clientService.sumaTotalaPlatita(idx);
    }

    public boolean checkRetired(int idx)
    {
        return clientService.checkRetired(idx);
    }
}
