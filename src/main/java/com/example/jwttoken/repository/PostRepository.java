package com.example.jwttoken.repository;

import com.example.jwttoken.model.Post;
import com.example.jwttoken.model.Subreddit;
import com.example.jwttoken.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
