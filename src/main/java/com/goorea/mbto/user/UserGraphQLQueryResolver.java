package com.goorea.mbto.user;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserGraphQLQueryResolver implements GraphQLQueryResolver {
    @Autowired
    private UserService userService;

    public User getUser(Long id) {
        return userService.getUser(id);
    }

    public List<User> findAll() {
        return userService.findAll();
    }

}
