package main.java.com.kidmed.service;

import main.java.com.kidmed.Main;
import main.java.com.kidmed.model.Kid;

public class KidService {
    public Kid registerNewKid(){
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
        kid.setAge( Main.SCANNER.nextInt());

        System.out.print("Name: ");
        kid.setName(Main.SCANNER.nextLine());

        System.out.print("Surname: ");
        kid.setSurName(Main.SCANNER.nextLine());

        System.out.print("Health state (healthy/sick): ");
        String healthState = Main.SCANNER.nextLine();
        kid.setHealthState(Kid.healthState.valueOf(healthState));

        return kid;
    }
}
