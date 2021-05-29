package com.goorea.mbto;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.goorea.mbto.post.Post;
import com.goorea.mbto.post.PostService;
import com.goorea.mbto.user.User;
import com.goorea.mbto.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MbtoGraphQLQueryResolver implements GraphQLQueryResolver {
    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    public User getUser(Long id) {
        return userService.getUser(id);
    }

    public List<User> getUserList() {
        return userService.getUserList();
    }

    public Post getPost(Long id) {
        return postService.getPost(id);
    }

    public List<Post> getPostList() {
        return postService.getPostList();
    }
}
