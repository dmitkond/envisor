package dev.dmitkond.envisor.inventory.service;

import dev.dmitkond.envisor.inventory.repository.UnitRepository;
import org.springframework.stereotype.Service;

@Service
public class UnitService {
    private final UnitRepository unitRepository;

    public UnitService(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }
}
