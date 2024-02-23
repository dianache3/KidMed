package main.java.com.kidmed.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   private String firstName;
   private String lastName;
   private String email;
   private Location location;
   private List<Kid> kids = new ArrayList<>();
   private final LocalDateTime firstEntry = LocalDateTime.now();

   @Override
   public String toString() {
       return "Client {"
               + "\n\tfirstName = " +firstName
               + ", lastName = " + lastName
               + ", email = " + email
               + ", firstEntry = " + firstEntry.format(FORMATTER)
               + ", location = " + location
               +", \n\tkids = " + kids
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
                && Objects.equals(kids, client.kids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, kids);
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

    public void setKids(List<Kid> kids) {
        this.kids = kids;
    }
    public List<Kid> getKids() {
        return kids;
    }
    public void addKid(Kid kid) {
       kids.add(kid);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public enum Location {
       KYIV, LVIV, ODESA, UNKNOWN
    }
}
