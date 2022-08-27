package com.sanjay.springAngular.springAngular;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private final UserRepository userRepository;



    @GetMapping("/users")
    public List<Users> getUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody Users users) {
        userRepository.save(users);
    }
}