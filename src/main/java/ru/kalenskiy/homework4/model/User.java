package ru.kalenskiy.homework4.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Класс пользователя
 */
@Data
@AllArgsConstructor
public class User {
    /**
     * Поле имени пользователя
     */
    private String name;
    /**
     * Поле фамилия пользователя
     */
    private String lastName;
    /**
     * Поле возраст пользователя
     */
    private int age;

}
