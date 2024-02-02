package ru.kalenskiy.homework4.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kalenskiy.homework4.model.User;
import ru.kalenskiy.homework4.service.UserService;

@Controller
//@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public String helloUser(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "user-create";
    }

    @PostMapping("/users")
    public String addUser(User user, Model model){
        userService.addUser(user);
        model.addAttribute("users", userService.getAllUser());
        return "user-create";
    }
}
