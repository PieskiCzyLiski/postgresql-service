package io.liski.postgresql.repositories;

import io.liski.postgresql.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
