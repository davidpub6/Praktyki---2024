package com.example.zad3.App;

import jakarta.validation.constraints.*;

public class Guests {

    @NotNull(message = "Name cant be empty")
    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    private String name;

    //@NotNull(message = "Age cant be empty")
    @Min(value = 18, message = "Age must be at least 18")
    private int age;

    
    public Guests() {}

    public Guests(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

}
