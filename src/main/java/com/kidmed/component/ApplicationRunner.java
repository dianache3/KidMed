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
                System.out.println("Do you want to add a kid? (yes/no)");
                String answer = Main.SCANNER.nextLine();

                if (answer.equals("yes")) {
                    System.out.println("Adding a new kid.");
                    Kid kid = kidService.registerNewKid();
                    client.setKid(kid);
                    kid.setParent(client.getFirstName() + " " + client.getLastName());
                    System.out.println("Kid has been added.");
                } else {
                    System.out.println("You have no kid added.");
                }
            }
        }
    }
}
