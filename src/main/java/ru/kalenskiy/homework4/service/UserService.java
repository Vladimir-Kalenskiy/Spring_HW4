package ru.kalenskiy.homework4.service;

import org.springframework.stereotype.Service;
import ru.kalenskiy.homework4.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public List<User>getAllUser(){
        return users;
    }

}
