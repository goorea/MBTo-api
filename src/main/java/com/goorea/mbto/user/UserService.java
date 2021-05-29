package com.goorea.mbto.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public boolean createUser(User user) {
        userRepository.save(user);
        return true;
    }

    public boolean putUser(Long id, User user) {
        if (userRepository.existsById(id)) {
            userRepository.save(user);

            return true;
        } else {
            return false;
        }
    }

    public boolean delUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
