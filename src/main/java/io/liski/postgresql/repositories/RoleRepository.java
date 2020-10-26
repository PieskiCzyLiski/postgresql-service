package io.liski.postgresql.repositories;

import io.liski.postgresql.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
