package com.example.demo.api;

import com.example.demo.annotation.SuppressFBWarnings;
import com.example.demo.dbo.User;
import com.example.demo.repo.UserRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SuppressFBWarnings("SPRING_ENDPOINT")
public class DemoController {

    private final UserRepo userRepo;

    public DemoController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users")
    public List<User> test() {
        return userRepo.findAll();
    }

}
