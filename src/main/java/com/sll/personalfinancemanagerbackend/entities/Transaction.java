package com.sll.personalfinancemanagerbackend.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Transaction {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private String description;
    private Double amount;
    private Date date;
//    private User user;
    private Long id;
    @ManyToOne
    private Category category;

    public Transaction() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Transaction(Long id, User user, Date date, Category category, Double amount, String description) {
        this.id = id;
//        this.user = user;
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

}
