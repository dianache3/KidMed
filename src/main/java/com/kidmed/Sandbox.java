package main.java.com.kidmed;

import main.java.com.kidmed.comparator.KidAgeComparator;
import main.java.com.kidmed.model.Kid;

import java.util.Arrays;
import java.util.Comparator;

public class Sandbox {
    public static void main(String[] args) {
        Kid[] kids = {
            new Kid(2),
            new Kid(3),
            new Kid(8),
            new Kid(12),
            new Kid(4)
        };
        Arrays.sort(kids, new KidAgeComparator());

        for(Kid kid : kids) {
            System.out.println(kid.getAge());
        }

        Kid[] kids1 = {
                new Kid(Kid.healthState.healthy),
                new Kid(Kid.healthState.sick),
                new Kid(Kid.healthState.sick),
                new Kid(Kid.healthState.healthy)
        };
        Arrays.sort(kids1, new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return o1.getHealthState().getValue() - o2.getHealthState().getValue();
            }
        });

        for(Kid kid: kids1){
            System.out.println(kid.getHealthState());
        }
    }
}
