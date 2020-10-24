package io.liski.postgresql.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Translator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long translator_id;
    private String name;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Translator_Book",
            joinColumns = {@JoinColumn(name = "translator_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")}
    )
    Set<Book> books = new HashSet<>();

    public Long getTranslator_id() {
        return translator_id;
    }

    public void setTranslator_id(Long id) {
        this.translator_id = id;
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
