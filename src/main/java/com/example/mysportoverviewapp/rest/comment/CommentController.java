package com.example.mysportoverviewapp.rest.comment;

import com.example.mysportoverviewapp.domain.LeagueRound;
import com.example.mysportoverviewapp.rest.comment.CommentDto;
import com.example.mysportoverviewapp.service.CommentService;
import com.example.mysportoverviewapp.service.LeagueRoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService service;

    @PostMapping("/add")
    public void addComment(@RequestBody CommentDto dto) {
        service.add(dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteComment(@PathVariable Long id) {
        service.delete(id);
    }
}
