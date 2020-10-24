package io.liski.postgresql.domain;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
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

  @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
  private List<Reservation> reservations = new ArrayList<>();

  @ManyToMany(mappedBy = "books", cascade = CascadeType.ALL)
  private List<Favourite> favourites = new ArrayList<>();

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

  public List<Reservation> getReservations() {
    return reservations;
  }

  public void setReservations(List<Reservation> reservations) {
    this.reservations = reservations;
  }

  public List<Favourite> getFavourites() {
    return favourites;
  }

  public void setFavourites(List<Favourite> favourite) {
    this.favourites = favourite;
  }
}
