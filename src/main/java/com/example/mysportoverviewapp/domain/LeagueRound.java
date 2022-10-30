package com.example.mysportoverviewapp.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity(name="round")
public class LeagueRound {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "leagueRound", cascade=CascadeType.ALL)
    @JsonManagedReference
    private List<Result> results;

    @OneToMany(mappedBy = "leagueRound", cascade=CascadeType.ALL)
    @JsonManagedReference
    private List<Timetable> timetables;

    @OneToMany(mappedBy = "leagueRound", cascade=CascadeType.ALL)
    @JsonManagedReference
    private List<Comment> comments;

    public LeagueRound(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public LeagueRound() {

    }

    public LeagueRound(Long id, String name, List<Result> results, List<Timetable> timetables) {
        this.id = id;
        this.name = name;
        this.results = results;
        this.timetables = timetables;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public List<Timetable> getTimetables() {
        return timetables;
    }

    public void setTimetables(List<Timetable> timetables) {
        this.timetables = timetables;
    }
}
