package io.liski.postgresql.repositories;

import io.liski.postgresql.domain.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
