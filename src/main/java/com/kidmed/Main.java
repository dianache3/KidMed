package main.java.com.kidmed;

import java.util.Scanner;

public class Main {
    static String password = "pass";
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }
    static void run(){
        boolean accepted = false;
        for (int i = 0; i<3; i++){
            System.out.print("Password: ");
            String input = SCANNER.nextLine();

            if (password.equals(input)){
                accepted = true;
                break;
            }else {
                System.out.println("Access denied. Please check your password.");
            }
        }
        System.out.println(accepted ? "Welcome to the Kids Medical!" : "Application has been blocked.");
    }
}