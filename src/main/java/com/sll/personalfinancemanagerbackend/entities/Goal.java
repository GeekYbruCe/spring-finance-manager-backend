package com.sll.personalfinancemanagerbackend.entities;

import jakarta.persistence.*;


@Entity
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String category;
    private Double targetAmount;

    public Goal() {

    }


    public Double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Goal(int id, Double targetAmount, String category, String name) {
        this.id = id;
        this.targetAmount = targetAmount;
        this.category = category;
        this.name = name;
    }

}
