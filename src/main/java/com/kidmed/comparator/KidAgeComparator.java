package main.java.com.kidmed.comparator;

import main.java.com.kidmed.model.Kid;

import java.util.Comparator;

public class KidAgeComparator implements Comparator<Kid> {
    @Override
    public int compare(Kid kid1, Kid kid2) {
        return kid1.getAge() - kid2.getAge();
    }

}
