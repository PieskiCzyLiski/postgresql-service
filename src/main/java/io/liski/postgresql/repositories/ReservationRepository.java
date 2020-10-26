package io.liski.postgresql.repositories;

import io.liski.postgresql.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
