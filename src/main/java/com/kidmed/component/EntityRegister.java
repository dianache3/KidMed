package main.java.com.kidmed.component;

import main.java.com.kidmed.Main;
import main.java.com.kidmed.model.Client;
import main.java.com.kidmed.model.Kid;
import main.java.com.kidmed.service.ClientService;
import main.java.com.kidmed.service.KidService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EntityRegister {

    private final ClientService clientService = new ClientService();
    private final KidService kidService = new KidService();

    public void registerClients() {
        List<Client> clients = new ArrayList<>();

        String message = "Do you want to register more clients? (y/n)";

        do {
            Optional<Client> client = addClient();
            client.ifPresent(clients::add);
            } while (verifyRepeating(message));

        Map<Client.Location, List<Client>> clientsByLocation = clients.stream()
                        .collect(Collectors.groupingBy(Client::getLocation));

        printClients(clientsByLocation);
        }

    private void printClients(Map<Client.Location, List<Client>> clientsByLocation) {
        for (Map.Entry<Client.Location, List<Client>> clients : clientsByLocation.entrySet()) {
            String content = "\nLocation: " + clients.getKey()
                    + "\nClients = (" + clients.getValue().size() + "):"
                    + "\n\t" + clients.getValue();

            System.out.println(content);
        }
    }

    private Optional<Client> addClient() {
        Optional<Client> client = clientService.registerNewClient();
        client.ifPresent(this::registerKids);

        return client;
    }
    private void registerKids(Client client) {
        String message = "Do you want to add more kids for the current client? (y/n)";

        do {
            addKid(client);
            System.out.println(client);
        }while (verifyRepeating(message));
    }
    private void addKid(Client client) {
        System.out.println("Adding a new kid.");

        Kid kid = kidService.registerNewKid();
        if (kid != null) {
            client.addKid(kid);
            kid.setParent(client.getFirstName() + " " + client.getLastName());
            System.out.println("Kid has been added.");
        }
    }

    private boolean verifyRepeating(String message) {
        System.out.println(message);

        String answer = Main.SCANNER.nextLine();
        if("y".equals(answer)) {
            return true;
        } else if("n".equals(answer)) {
            return false;
        } else {
            System.out.println("Incorrect answer. Please try again.");
            return verifyRepeating(message);
        }
    }
}
