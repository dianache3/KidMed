package main.java.com.kidmed.component;

import main.java.com.kidmed.Main;
import main.java.com.kidmed.model.Client;
import main.java.com.kidmed.model.Kid;
import main.java.com.kidmed.service.ClientService;
import main.java.com.kidmed.service.KidService;

public class ApplicationRunner {
    private final ClientService clientService = new ClientService();
    private final KidService kidService = new KidService();

    public void run() {
        if (Authenticator.auth()) {
            Client client = clientService.registerNewClient();

            if (client != null) {
                registerKids(client);
                System.out.println(client);
            }
        }
    }
    private void registerKids (Client client) {
        boolean continueAddKids = true;
        while (continueAddKids) {
            addKid(client);

            System.out.println("Do you want to add more kids for the current client? (y/n)");
            String answer = Main.SCANNER.nextLine();

            if("n".equals(answer)) {
                continueAddKids = false;
            }
        }
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
}
