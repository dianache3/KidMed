package main.java.com.kidmed.model;

import java.util.Objects;

public class Kid {
    private String sex;
    private String name;
    private String surName;
    private int age;
    private String parent;

    public Kid(){}

    public Kid(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "{name = " + name
                + ", surName = " + surName
                + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kid kid = (Kid) o;
        return Objects.equals(sex, kid.sex)
                && Objects.equals(name, kid.name)
                && Objects.equals(surName, kid.surName)
                && Objects.equals(age, kid.age)
                && Objects.equals(parent, kid.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sex, name, surName, age, parent);
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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
}
