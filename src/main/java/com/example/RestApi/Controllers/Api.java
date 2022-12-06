package com.example.RestApi.Controllers;

import com.example.RestApi.Models.User;
import com.example.RestApi.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Api {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String getPage() {
        return "<h1>Hello</h1>";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping("/create")
    public String createUser(@RequestBody User user) {
        userRepo.save(user);

        return "User created";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id) {
        User deleteUser = userRepo.findById(id).get();

        userRepo.delete(deleteUser);

        return "User deleted";
    }
}
