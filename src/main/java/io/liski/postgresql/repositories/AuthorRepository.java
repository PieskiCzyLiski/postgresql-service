package io.liski.postgresql.repositories;

import io.liski.postgresql.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
