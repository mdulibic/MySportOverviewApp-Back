package com.example.mysportoverviewapp.service;

import com.example.mysportoverviewapp.dao.TeamRepository;
import com.example.mysportoverviewapp.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository repo;

    public List<Team> listAll() {
        return repo.findAll();
    }

    public void add(List<Team> teams) {
        repo.saveAll(teams);
    }

}
