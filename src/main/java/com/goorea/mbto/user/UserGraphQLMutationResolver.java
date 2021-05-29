package com.goorea.mbto.user;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserGraphQLMutationResolver implements GraphQLMutationResolver {
    @Autowired
    UserService userService;

    public boolean putUser(User user) {
        return userService.putUser(user);
    }
}
