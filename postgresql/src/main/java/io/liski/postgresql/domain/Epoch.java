package io.liski.postgresql.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Epoch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long epoch_id;
    private String name;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Epoch_Book",
            joinColumns = {@JoinColumn(name = "epoch_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")}
    )
    Set<Book> books = new HashSet<>();

    public Long getEpoch_id() {
        return epoch_id;
    }

    public void setEpoch_id(Long id) {
        this.epoch_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
