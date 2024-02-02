package ru.kalenskiy.homework4.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class User {
    private String name;
    private String lastName;
    private int age;

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
