package com.example.jwttoken.repository;

import com.example.jwttoken.model.Comment;
import com.example.jwttoken.model.Post;
import com.example.jwttoken.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
