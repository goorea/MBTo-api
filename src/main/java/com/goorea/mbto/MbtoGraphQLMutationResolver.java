package com.goorea.mbto;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.goorea.mbto.post.Post;
import com.goorea.mbto.post.PostService;
import com.goorea.mbto.user.User;
import com.goorea.mbto.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MbtoGraphQLMutationResolver implements GraphQLMutationResolver {
    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    public boolean createUser(User user) {
        return userService.createUser(user);
    }

    public boolean putUser(Long id, User user) {
        return userService.putUser(id, user);
    }

    public boolean delUser(Long id) {
        return userService.delUser(id);
    }

    public boolean createPost(Post post, Long user_id) {
        return postService.createPost(post, user_id);
    }

    public boolean putPost(Long id, Post post) {
        return postService.putPost(id, post);
    }

    public boolean delPost(Long id) {
        return postService.delPost(id);
    }

}
