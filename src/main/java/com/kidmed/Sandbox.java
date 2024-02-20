package main.java.com.kidmed;

import main.java.com.kidmed.comparator.KidAgeComparator;
import main.java.com.kidmed.model.Kid;

import java.util.Arrays;

public class Sandbox {
    public static void main(String[] args) {
        Kid[] kids = {
            new Kid(1),
            new Kid(3),
            new Kid(8),
            new Kid(12),
            new Kid(4)
        };
        Arrays.sort(kids, new KidAgeComparator());

        for(Kid kid : kids) {
            System.out.println(kid.getAge());
        }
    }
}
