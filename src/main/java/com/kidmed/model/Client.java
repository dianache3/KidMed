package main.java.com.kidmed.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Client {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   private String firstName;
   private String lastName;
   private String email;
   private Kid kid;
   private final LocalDateTime firstEntry = LocalDateTime.now();

   @Override
   public String toString(){
       return "Client {"
               + "\n\tfirstName = " +firstName
               + ", lastName = " + lastName
               + ", email = " + email
               + ", firstEntry = " + firstEntry.format(FORMATTER)
               +", \n\tkid = " + kid
               +"\n}";
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName)
                && Objects.equals(lastName, client.lastName)
                && Objects.equals(email, client.email)
                && Objects.equals(kid, client.kid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, kid);
    }

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
