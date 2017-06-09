package tiy.demo.demo;

import javax.persistence.*;

/**
 * Created by Brice on 6/2/17.
 */

@Entity
@Table(name="lists")
public class List {

    @Id
    @GeneratedValue
    int listId;

    @ManyToOne
    User user;



    public List() {
    }

    public List(User user) {
        this.user = user;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
