package com.example.mysportoverviewapp.service;

import com.example.mysportoverviewapp.dao.CommentRepository;
import com.example.mysportoverviewapp.dao.LeagueRoundRepository;
import com.example.mysportoverviewapp.domain.Comment;
import com.example.mysportoverviewapp.domain.LeagueRound;
import com.example.mysportoverviewapp.rest.comment.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository repo;

    @Autowired
    private LeagueRoundRepository leagueRepo;

    public void add(CommentDto commentDto) {
        LeagueRound round = leagueRepo.findById(commentDto.getRoundId()).orElseThrow();
        repo.save(new Comment(commentDto, round));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

