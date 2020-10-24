package io.liski.postgresql.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Kind {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kind_id;
    private String name;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Kind_Book",
            joinColumns = {@JoinColumn(name = "kind_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")}
    )
    Set<Book> books = new HashSet<>();

    public Long getKind_id() {
        return kind_id;
    }

    public void setKind_id(Long id) {
        this.kind_id = id;
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
