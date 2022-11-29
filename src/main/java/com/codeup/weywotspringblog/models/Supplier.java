package com.codeup.weywotspringblog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "supplier")
    private List<Coffee> coffees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Coffee> getCoffees() {
        return coffees;
    }

    public void setCoffees(List<Coffee> coffees) {
        this.coffees = coffees;
    }

    public Supplier() {
    }

    public Supplier(String name) {
        this.name = name;
    }

    public Supplier(long id, String name) {
        this.id = id;
        this.name = name;
    }


    public Supplier(long id, String name, List<Coffee> coffees) {
        this.id = id;
        this.name = name;
        this.coffees = coffees;
    }


}
