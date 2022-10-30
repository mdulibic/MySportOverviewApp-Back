package com.example.mysportoverviewapp.service;

import com.example.mysportoverviewapp.dao.ResultRepository;
import com.example.mysportoverviewapp.dao.TeamRepository;
import com.example.mysportoverviewapp.domain.Result;
import com.example.mysportoverviewapp.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    private ResultRepository repo;

    public List<Result> listAll() {
        return repo.findAll();
    }

    public void add(Result result) {
        repo.save(result);
    }

}

