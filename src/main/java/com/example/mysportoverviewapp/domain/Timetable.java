package com.example.mysportoverviewapp.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity(name="timetable")
public class Timetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String team1;

    private String team2;

    private String timeAndDate;

    @ManyToOne
    @JoinColumn(name="league_round_id", nullable=false)
    @JsonBackReference
    private LeagueRound leagueRound;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTimeAndDate() {
        return timeAndDate;
    }

    public void setTimeAndDate(String timeAndDate) {
        this.timeAndDate = timeAndDate;
    }

    public LeagueRound getLeagueRound() {
        return leagueRound;
    }

    public void setLeagueRound(LeagueRound leagueRound) {
        this.leagueRound = leagueRound;
    }
}
