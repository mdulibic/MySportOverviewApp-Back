package com.example.mysportoverviewapp.service;

import com.example.mysportoverviewapp.dao.LeagueRoundRepository;
import com.example.mysportoverviewapp.dao.ResultRepository;
import com.example.mysportoverviewapp.domain.LeagueRound;
import com.example.mysportoverviewapp.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueRoundService {

    @Autowired
    private LeagueRoundRepository repo;

    public List<LeagueRound> listAll() {
        return repo.findAll();
    }

    public void add(Long id) {
        if (!repo.existsById(id)) {
            repo.save(new LeagueRound(id, "Round " + id));
        }
    }

}
