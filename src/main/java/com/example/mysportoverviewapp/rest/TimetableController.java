package com.example.mysportoverviewapp.rest;

import com.example.mysportoverviewapp.domain.Result;
import com.example.mysportoverviewapp.domain.Timetable;
import com.example.mysportoverviewapp.service.ResultService;
import com.example.mysportoverviewapp.service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/timetable")
public class TimetableController {

    @Autowired
    private TimetableService service;

    @GetMapping("")
    public List<Timetable> showTimetable() { return service.listAll(); }

    @PostMapping("/add")
    public void addMatchSchedule(@RequestBody Timetable timetable) { service.add(timetable);
    }
}
