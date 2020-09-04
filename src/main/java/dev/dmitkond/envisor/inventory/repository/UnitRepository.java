package dev.dmitkond.envisor.inventory.repository;

import dev.dmitkond.envisor.inventory.Unit;
import org.springframework.data.repository.Repository;

public interface UnitRepository extends Repository<Unit, Long> {
    Unit save(Unit unit);
}
