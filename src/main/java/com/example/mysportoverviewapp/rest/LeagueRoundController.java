package com.example.mysportoverviewapp.rest;

import com.example.mysportoverviewapp.domain.LeagueRound;
import com.example.mysportoverviewapp.domain.Team;
import com.example.mysportoverviewapp.service.LeagueRoundService;
import com.example.mysportoverviewapp.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/leagueRound")
public class LeagueRoundController {

    @Autowired
    private LeagueRoundService service;

    @GetMapping("")
    public List<LeagueRound> listRounds() { return service.listAll(); }

    @PostMapping("/add")
    public void addRound(@RequestBody Long id) { service.add(id);
    }
}
