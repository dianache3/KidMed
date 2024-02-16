package main.java.com.kidmed.model;

public class Client {
   private String firstName;
   private String lastName;
   private String email;
   private Kid kid;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setKid(Kid kid) {
        this.kid = kid;
    }

    public Kid getKid() {
        return kid;
    }
}
