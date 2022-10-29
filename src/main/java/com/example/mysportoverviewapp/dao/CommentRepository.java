package com.example.mysportoverviewapp.dao;

import com.example.mysportoverviewapp.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
