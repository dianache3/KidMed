package main.java.com.kidmed.service;

import main.java.com.kidmed.Main;
import main.java.com.kidmed.model.Kid;

public class KidService {
    public Kid registerNewKid() {
        Kid kid = new Kid();
        System.out.print("Gender (male/female): ");
        String sex = Main.SCANNER.nextLine();
        kid = buildKid(sex);
        return kid;
    }

    private Kid buildKid(String sex) {
        Kid kid = new Kid();
        kid.setSex(sex);

        System.out.print("Age: ");
        String age = Main.SCANNER.nextLine();
        kid.setAge(Integer.parseInt(age));

        System.out.print("Name: ");
        kid.setName(Main.SCANNER.nextLine());

        System.out.print("Health state (healthy/sick): ");
        Kid.healthState healthState;
        String healthStateInput = Main.SCANNER.nextLine();

        try {
            healthState = Kid.healthState.valueOf(healthStateInput);
        } catch (IllegalArgumentException e){
            healthState = Kid.healthState.unknown;
            System.out.println("Unable to parse value '" + healthStateInput +
                    "'. Using default value: " + Kid.healthState.unknown);
        }
        kid.setHealthState(healthState);
        return kid;
    }
}
