package com.example.RestApi.Models;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String email;

    // getters and setters for id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // getters and setters for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
