package io.liski.postgresql.domain;

import javax.persistence.*;

@Entity
public class Favourite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long favourite_id;
    private String email;
    private String name;

    @OneToOne(mappedBy = "favourite")
    private User user;

    @OneToOne(mappedBy = "favourite")
    private Book book;

    public Long getFavourite_id() {
        return favourite_id;
    }

    public void setFavourite_id(Long id) {
        this.favourite_id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
