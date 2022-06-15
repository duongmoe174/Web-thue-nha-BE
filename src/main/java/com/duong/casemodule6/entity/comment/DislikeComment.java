package com.duong.casemodule6.entity.comment;

import com.duong.casemodule6.entity.user.AppUser;

import javax.persistence.*;

@Entity
@Table(name = "dislike_comments")
public class DislikeComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Comment comment;

    @OneToOne
    private AppUser user;

    public DislikeComment() {
    }

    public DislikeComment(Comment comment, AppUser user) {
        this.comment = comment;
        this.user = user;
    }

    public DislikeComment(Long id, Comment comment, AppUser user) {
        this.id = id;
        this.comment = comment;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }
}
