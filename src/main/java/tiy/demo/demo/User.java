package tiy.demo.demo;

import javax.persistence.*;

/**
 * Created by Brice on 6/2/17.
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    int userId;

    @Column
    String firstName;

    @Column
    String lastName;

    @Column
    String email;



    public User() {
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
