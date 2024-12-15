package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class User {
    @Id
    private String user;

    private String password;

    private String role; // Campo para el rol del usuario

    private int score; // Campo para la puntuación

    private LocalDate date; // Campo para la fecha de la última actualización de la puntuación

    public User() {}

    public User(String user, String password, String role, int score, LocalDate date) {
        this.user = user;
        this.password = password;
        this.role = role;
        this.score = score;
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}