package com.goorea.mbto.post;

import com.goorea.mbto.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostService {
    @Autowired
    PostRepository postRepository;

    @Autowired
    UserRepository userRepository;

    public Post getPost(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public List<Post> getPostList() {
        return postRepository.findAll();
    }

    public boolean createPost(Post post, Long user_id) {
        post.setUser(userRepository.findById(user_id).orElse(null));
        postRepository.save(post);

        return true;
    }

    public boolean putPost(Long id, Post post) {
        if (postRepository.existsById(id)) {
            postRepository.save(post);

            return true;
        } else {
            return false;
        }
    }

    public boolean delPost(Long id) {
        if (postRepository.existsById(id)) {
            postRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
