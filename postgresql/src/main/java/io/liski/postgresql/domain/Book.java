package io.liski.postgresql.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean audio;
    private String fragment;
    private String isbn;
    private String title;

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors = new HashSet<>();

    @ManyToMany(mappedBy = "books")
    private Set<Kind> kinds = new HashSet<>();

    @ManyToMany(mappedBy = "books")
    private Set<Translator> translators = new HashSet<>();

    @ManyToMany(mappedBy = "books")
    private Set<Genre> genres = new HashSet<>();

    @ManyToMany(mappedBy = "books")
    private Set<Epoch> epochs = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reservation_id", referencedColumnName = "id")
    private Reservation reservation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "favourite_id", referencedColumnName = "id")
    private Favourite favourite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAudio() {
        return audio;
    }

    public void setAudio(boolean audio) {
        this.audio = audio;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Set<Kind> getKinds() {
        return kinds;
    }

    public void setKinds(Set<Kind> kinds) {
        this.kinds = kinds;
    }

    public Set<Translator> getTranslators() {
        return translators;
    }

    public void setTranslators(Set<Translator> translators) {
        this.translators = translators;
    }

    public Set<Genre> getGenrres() {
        return genres;
    }

    public void setGenrres(Set<Genre> genrres) {
        this.genres = genrres;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Set<Epoch> getEpochs() {
        return epochs;
    }

    public void setEpochs(Set<Epoch> epochs) {
        this.epochs = epochs;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Favourite getFavourite() {
        return favourite;
    }

    public void setFavourite(Favourite favourite) {
        this.favourite = favourite;
    }
}
