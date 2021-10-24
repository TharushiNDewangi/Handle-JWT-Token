package com.assignment.Registration_backend.repository;


import com.assignment.Registration_backend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
