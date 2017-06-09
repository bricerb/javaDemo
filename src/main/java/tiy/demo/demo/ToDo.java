package tiy.demo.demo;

import javax.persistence.*;

/**
 * Created by Brice on 6/2/17.
 */

@Entity
@Table(name = "todos")
public class ToDo {

    @Id
    @GeneratedValue
    int todoId;

    @ManyToOne
    List list;

    @Column
    String content;

    @Column
    boolean isDone;



    public ToDo() {
    }

    public ToDo(String content, boolean isDone) {
        this.content = content;
        this.isDone = isDone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
