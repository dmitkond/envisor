package dev.dmitkond.envisor.inventory.repository;

import dev.dmitkond.envisor.inventory.Part;
import org.springframework.data.repository.Repository;

public interface PartRepository extends Repository<Part, Long> {
    Part save(Part part);
}
