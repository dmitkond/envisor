package dev.dmitkond.envisor.inventory;

import dev.dmitkond.envisor.inventory.repository.PartTypeConverter;

import javax.persistence.*;

@Entity
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    @Convert(converter = PartTypeConverter.class)
    private PartType type;

    @ManyToOne
    private PartGroup group;

    @ManyToOne
    private Unit unit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PartType getType() {
        return type;
    }

    public void setType(PartType type) {
        this.type = type;
    }

    public PartGroup getGroup() {
        return group;
    }

    public void setGroup(PartGroup group) {
        this.group = group;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
