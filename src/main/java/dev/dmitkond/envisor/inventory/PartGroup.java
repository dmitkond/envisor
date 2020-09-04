package dev.dmitkond.envisor.inventory;

import javax.persistence.*;

@Entity
public class PartGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    private PartGroup parent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PartGroup getParent() {
        return parent;
    }

    public void setParent(PartGroup parent) {
        this.parent = parent;
    }
}
