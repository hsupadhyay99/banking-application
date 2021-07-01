package com.hari.upadhyay.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hari.upadhyay.cons.Status;
import com.hari.upadhyay.entity.User;
import com.hari.upadhyay.repository.UserRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @CrossOrigin()
    @PostMapping("/users/register")
    public Status registerUser(@Valid @RequestBody User newUser) {
        List<User> users = userRepository.findAll();

        for (User user : users) {
            if (user.equals(newUser)) {
                System.out.println("User Already exists!");
                return Status.USER_ALREADY_EXISTS;
            }
        }

        userRepository.save(newUser);
        return Status.SUCCESS;
    }

    @CrossOrigin()
    @PostMapping("/users/login")
    public Status loginUser(@Valid @RequestBody User user) {
        List<User> users = userRepository.findAll();

        for (User other : users) {
            if (other.equals(user)) {
                user.setLoggedIn(true);
                userRepository.save(user);
                return Status.SUCCESS;
            }
        }

        return Status.FAILURE;
    }

}