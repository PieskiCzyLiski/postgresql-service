package io.liski.postgresql.repositories;

import io.liski.postgresql.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
