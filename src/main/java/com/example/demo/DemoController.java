package com.example.demo;

import com.example.demo.dbo.User;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public List<User> test() {
        return userRepo.findAll();
    }

}
