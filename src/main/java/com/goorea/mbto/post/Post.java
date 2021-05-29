package com.goorea.mbto.post;

import com.goorea.mbto.comment.Comment;
import com.goorea.mbto.user.User;
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
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String contents;

    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    @Generated(GenerationTime.INSERT)
    private Date created_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "post")
    private final List<Comment> comments = new ArrayList<Comment>();
}
