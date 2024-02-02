package ru.kalenskiy.homework4.service;

import org.springframework.stereotype.Service;
import ru.kalenskiy.homework4.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Пользовательский сервис
 */
@Service
public class UserService {
    List<User> users = new ArrayList<>();

    /**
     * Метод добавления пользователя
     * @param user пользователь
     */
    public void addUser(User user){
        users.add(user);
    }

    /**
     * Метод получения списка пользователей
     * @return список пользователей
     */
    public List<User>getAllUser(){
        return users;
    }

}
