package dev.dmitkond.envisor.inventory.service;

import dev.dmitkond.envisor.inventory.repository.PartRepository;
import org.springframework.stereotype.Service;

@Service
public class PartService {
    private final PartRepository partRepository;

    public PartService(PartRepository partRepository) {
        this.partRepository = partRepository;
    }
}
