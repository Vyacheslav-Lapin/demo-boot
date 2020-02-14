package ru.cbr.courses.demoboot.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.cbr.courses.demoboot.model.Cat;

@RepositoryRestResource
public interface CatRepository extends JpaRepository<Cat, UUID> {
}
