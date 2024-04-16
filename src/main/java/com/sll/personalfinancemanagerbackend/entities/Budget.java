package com.sll.personalfinancemanagerbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Budget {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private int amount;
    private String name;
    private String description;

    public Budget() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Budget(Long id, String description, String name, int amount) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.amount = amount;
    }

}
