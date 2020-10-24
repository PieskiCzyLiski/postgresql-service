package io.liski.postgresql.repositories;

import io.liski.postgresql.domain.Translator;
import org.springframework.data.repository.CrudRepository;

public interface TranslatorRepository extends CrudRepository<Translator, Long> {
}
