package io.liski.postgresql.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "epoch")
public class Epoch {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @ManyToMany(cascade = {CascadeType.ALL})
  @JoinTable(
      name = "Epoch_Book",
      joinColumns = {@JoinColumn(name = "epoch_id")},
      inverseJoinColumns = {@JoinColumn(name = "book_id")}
  )
  Set<Book> books = new HashSet<>();

  public Long getEpoch_id() {
    return id;
  }

  public void setEpoch_id(Long id) {
    this.id = id;
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
