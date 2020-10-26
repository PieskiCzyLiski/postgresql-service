package io.liski.postgresql.repositories;

import io.liski.postgresql.domain.Kind;
import org.springframework.data.repository.CrudRepository;

public interface KindRepository extends CrudRepository<Kind, Long> {
}
