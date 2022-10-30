package com.example.mysportoverviewapp.service;

import com.example.mysportoverviewapp.dao.TimetableRepository;
import com.example.mysportoverviewapp.domain.Timetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimetableService {

    @Autowired
    private TimetableRepository repo;

    public List<Timetable> listAll() {
        return repo.findAll();
    }

    public void add(Timetable timetable) {
        repo.save(timetable);
    }

}