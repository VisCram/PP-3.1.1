package com.example.Project2Boot.controller;

import com.example.Project2Boot.model.User;
import com.example.Project2Boot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }

    @PostMapping("/addNewUser")
    public String showFormForAddUser(Model model) {
        model.addAttribute("user", new User());
        return "addNewUser";
    }

    @PostMapping("/saveNewUser")
    public String saveNewUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";

    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") Integer id) {
        userService.deleteUser(id);
        return "redirect:/";
    }

    @GetMapping("/updateUser")
    public String showFormForUpdateUser(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("update", userService.getUserById(id));
        return "updateUser";
    }

    @PostMapping("/updateExistingUser")
    public String updateExistingUser(@RequestParam("id") Integer id, @ModelAttribute("user") User user) {
        user.setId(id);
        userService.updateUser(user, id);
        return "redirect:/";

    }
}


