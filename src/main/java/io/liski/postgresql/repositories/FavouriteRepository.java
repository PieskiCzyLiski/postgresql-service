package io.liski.postgresql.repositories;

import io.liski.postgresql.domain.Favourite;
import org.springframework.data.repository.CrudRepository;

public interface FavouriteRepository extends CrudRepository<Favourite, Long> {
}
