package com.example.mysportoverviewapp.rest;

import com.example.mysportoverviewapp.domain.Result;
import com.example.mysportoverviewapp.domain.Team;
import com.example.mysportoverviewapp.service.ResultService;
import com.example.mysportoverviewapp.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/results")
public class ResultController {

    @Autowired
    private ResultService service;

    @GetMapping("")
    public List<Result> listResults() { return service.listAll(); }

    @PostMapping("/add")
    public void addResult(@RequestBody Result result) { service.add(result);
    }
}
