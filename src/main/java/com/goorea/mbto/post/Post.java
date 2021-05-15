package com.goorea.mbto.post;

import com.goorea.mbto.comment.Comment;
import com.goorea.mbto.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String contents;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "post")
    private final List<Comment> comments = new ArrayList<Comment>();
}
