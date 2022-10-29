package com.example.mysportoverviewapp.rest.team;

import com.example.mysportoverviewapp.domain.Team;
import com.example.mysportoverviewapp.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamService service;

    @GetMapping("")
    public List<Team> listTeams() { return service.listAll(); }

    @PostMapping("/add")
    public void addTeams(@RequestBody List<Team> teams) { service.add(teams); }
}
