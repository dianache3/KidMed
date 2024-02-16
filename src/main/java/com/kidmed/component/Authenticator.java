package main.java.com.kidmed.component;

import main.java.com.kidmed.Main;

public class Authenticator {
    public static boolean auth(){
        boolean accepted = false;
        for (int i = 0; i<3; i++){
            System.out.print("Password: ");
            String input = Main.SCANNER.nextLine();

            String password = "pass";
            if (password.equals(input)){
                accepted = true;
                break;
            }else {
                System.out.println("Access denied. Please check your password.");
            }
        }
        System.out.println(accepted ? "Welcome to the Kids Medical!" : "Application has been blocked.");
        return accepted;
    }
}
