package com.goorea.mbto.user;

import com.goorea.mbto.comment.Comment;
import com.goorea.mbto.post.Post;
import com.goorea.mbto.user.enums.Gender;
import com.goorea.mbto.user.enums.MBTI;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String nickname;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String token;

    @Enumerated(EnumType.STRING)
    private MBTI MBTI;
    private String avatar;

    @OneToMany(mappedBy = "user")
    private final List<Post> posts = new ArrayList<Post>();

    @OneToMany(mappedBy = "user")
    private final List<Comment> comments = new ArrayList<Comment>();

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
}
