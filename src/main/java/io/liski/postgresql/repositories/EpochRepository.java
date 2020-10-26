package io.liski.postgresql.repositories;

import io.liski.postgresql.domain.Epoch;
import org.springframework.data.repository.CrudRepository;

public interface EpochRepository extends CrudRepository<Epoch, Long> {
}
