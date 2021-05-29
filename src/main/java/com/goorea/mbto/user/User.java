package com.goorea.mbto.user;

import com.goorea.mbto.comment.Comment;
import com.goorea.mbto.post.Post;
import com.goorea.mbto.user.enums.Gender;
import com.goorea.mbto.user.enums.MBTI;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@DynamicUpdate
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
    private MBTI mbti;
    private String avatar;

    @OneToMany(mappedBy = "user")
    private final List<Post> posts = new ArrayList<Post>();

    @OneToMany(mappedBy = "user")
    private final List<Comment> comments = new ArrayList<Comment>();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Generated(GenerationTime.INSERT)
    private Date created_at;
}
