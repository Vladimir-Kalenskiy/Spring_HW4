package ru.kalenskiy.homework4.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kalenskiy.homework4.model.User;
import ru.kalenskiy.homework4.service.UserService;

/**
 * Класс контроллера
 */
@Controller
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    /**
     * Поле пользовательский сервис
     */
    private final UserService userService;

    @GetMapping("/new")
    public String helloUser(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "user-create";
    }

    @PostMapping("/new")
    public String addUser(User user, Model model) {
        userService.addUser(user);
        model.addAttribute("users", userService.getAllUser());
        return "user-create";
    }
}
