package main.java.com.kidmed.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Kid {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private String sex;
    private String name;
    private int age;
    private String parent;
    private healthState healthState;
    private final LocalDateTime registrationDate = LocalDateTime.now();

    public Kid(){}

    public Kid(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "{name = " + name
                + ", age = " + age
                + ", healthState = " + healthState
                + ", registrationDate = " + registrationDate.format(FORMATTER)
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kid kid = (Kid) o;
        return Objects.equals(sex, kid.sex)
                && Objects.equals(name, kid.name)
                && Objects.equals(age, kid.age)
                && Objects.equals(parent, kid.parent)
                && Objects.equals(healthState,kid.healthState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sex, name, age, parent, healthState);
    }

    public Kid(Kid.healthState healthState) {
        this.healthState = healthState;
    }
    public enum healthState {
        healthy(1),
        sick(2),
        unknown(0)
        ;
        private final int value;
        healthState(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public healthState getHealthState() {
        return healthState;
    }

    public void setHealthState(healthState healthState) {
        this.healthState = healthState;
    }
}
