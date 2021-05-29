package com.goorea.mbto.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserApiController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public String getUsersApiTest() {
        return "{\"result\": \"ok\"}";
    }

    @GetMapping
    public User getUsers(@RequestParam Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
