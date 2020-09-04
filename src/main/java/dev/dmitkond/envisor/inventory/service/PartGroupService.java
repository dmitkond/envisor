package dev.dmitkond.envisor.inventory.service;

import dev.dmitkond.envisor.inventory.repository.PartGroupRepository;
import org.springframework.stereotype.Service;

@Service
public class PartGroupService {
    private final PartGroupRepository groupRepository;

    public PartGroupService(PartGroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }
}
