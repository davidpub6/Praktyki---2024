package com.example.zad3.App;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class Mail {

    @Email
    @NotNull(message = "Email cannot be null")
    private String email;

    public Mail() {
    }

    public Mail(@Email @NotNull(message = "Email cannot be null") String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
