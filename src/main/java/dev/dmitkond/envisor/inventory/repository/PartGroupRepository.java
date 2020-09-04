package dev.dmitkond.envisor.inventory.repository;

import dev.dmitkond.envisor.inventory.PartGroup;
import org.springframework.data.repository.Repository;

public interface PartGroupRepository extends Repository<PartGroup, Long> {
    PartGroup save(PartGroup group);
}
